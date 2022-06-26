import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;

public class ReadExcelFileDemo {

    public static FileInputStream fileInputStream = null;
    public static XSSFWorkbook workbook = null;
    public static XSSFSheet sheet = null;

    public static void main(String[] args) throws Exception {
        //readExcelRows();
        writeToExcel();

    }

    public static void readExcelRows() throws Exception{
        fileInputStream = new FileInputStream(new File("src/test/resources/BranchLibrary.xlsx"));

        // Create Workbook instance holding reference to .xlsx file
        workbook = new XSSFWorkbook(fileInputStream);

        // Get first/desired sheet from the workbook
        sheet = workbook.getSheet("BranchDetails");

        Iterator<Row> rowIterator = sheet.iterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {
                try {
                    Cell cell = cellIterator.next();
                    String value = "";
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            value = String.valueOf(cell.getNumericCellValue());
                            System.out.print(value+"\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            value = cell.getStringCellValue();
                            System.out.print(value+"\t");
                            break;
                    }
                } catch (NullPointerException e) {
                    System.out.println("Caught an exception while printing row data: " + e);
                }
            }
            System.out.println("\n");

        }

    }

    public static void writeToExcel() throws Exception{
        try {
            fileInputStream = new FileInputStream(new File("src/test/resources/BranchLibrary.xlsx"));
            // Create Workbook instance holding reference to .xlsx file
            workbook = new XSSFWorkbook(fileInputStream);

            // Get first/desired sheet from the workbook
            sheet = workbook.getSheet("BranchDetails");
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell actualCell = row.getCell(1);
                DataFormatter formatter = new DataFormatter();
                String val = formatter.formatCellValue(actualCell);
                    actualCell = row.getCell(1);
                    actualCell.setCellValue("This_Cell_Was_Updated");
                    break;
                }
            // Write the changes to workbook as shown below
            FileOutputStream fileOutputStream = new FileOutputStream(new File("src/test/resources/BranchLibrary.xlsx"));
            workbook.write(fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            fileInputStream.close();
        } catch (Exception e) {
            throw e;
        }

    }
}

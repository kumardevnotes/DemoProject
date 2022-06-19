

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadTextFileDemo {
    public static void main(String[] args) throws Exception {
        //readTextfile();
        writeIntoTextFile();
    }

    private static void readTextfile() throws Exception {
//        File file = new File("C:\\Users\\Kumar\\repos spring boot\\gs-rest-service\\DemoProject\\src\\test\\resources\\sample.txt");
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        String statement;
//
//        while ((statement = br.readLine()) != null)
//            System.out.println(statement);

        FileReader fr = new FileReader(
                "C:\\Users\\Kumar\\repos spring boot\\gs-rest-service\\DemoProject\\src\\test\\resources\\sample.txt");

        // Declaring loop variable
        int i;
        while ((i = fr.read()) != -1)
            // Print all the content of a file
            System.out.print((char) i);
    }

    private static void writeIntoTextFile() throws Exception {
        FileWriter fw = new FileWriter("C:\\Users\\Kumar\\repos spring boot\\gs-rest-service\\DemoProject\\src\\test\\resources\\sample.txt");
        fw.write("We are writing into text file");
        fw.close();
    }
}

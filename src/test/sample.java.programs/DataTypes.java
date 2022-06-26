import java.util.Locale;

public class DoubleToFloat {

    public static void  main(String args[]){
        //primitive data types
        boolean ismessageDisplayed  =  true;
        char employmentType = 'F' ; //T
        int empId  =  1011;
        float empSalary  =  1000.0010f;
        double empIncentives =  200.30;

        //user defined data types
        String name = "Mike Tyson";
        int[] empIds = {101,102,303,222};
        //System.out.println(ismessageDisplayed);

//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(0));
//        System.out.println(name.contains("Tyson"));
//        System.out.println(name.length());

        //Print array values starting from first index
        for(int index=0;index <empIds.length;index++){
            //System.out.println(empIds[index]);
        }

        //Print array values in reverse order
        for(int index=empIds.length-1;index >= 0;index--){
            System.out.println(empIds[index]);
        }

        //type conversion
        float randomvalue  =  100.45454f;
        int shortenedInt  = (int) randomvalue;
        //System.out.println(shortenedInt);

        int randomInt  =  200;
        double convertedDouble  = (double) randomInt;
        //System.out.println(convertedDouble);

    }
}

public class DataTypes {

    public static void  main(String args[]){
        //primitive data types
        boolean ismessageDisplayed  =  true; //false
        char employmentType = 'F' ; //T
        int empId  =  1011;
        float empSalary  =  1000.0010f;
        double empIncentives =  200.307575757575767676;

        //user defined data types or non-primitive
//        String name = "Mike Tyson "; //index starts from 0
//        System.out.println(name.toLowerCase());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.charAt(1));
//        System.out.println(name.contains("Tyson"));
//        System.out.println(name.length());
//{101,102,303,222} -  101 indicates 0, 102 indicates 1
        int[] empIds = {101,102,303,222}; //Arrays
        //Print array values starting from first index
        for(int index=0;index < empIds.length;index++){ //initialization; condition;increment
            //System.out.println(empIds[index]);
        }

        //Print array values in reverse order
        for(int index=empIds.length-1;index >= 0;index--){ //index = -1 >=0
            //System.out.println(empIds[index]); //empIds[0]
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

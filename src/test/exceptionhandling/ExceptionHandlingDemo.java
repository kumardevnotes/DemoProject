package src.test.exceptionhandling;
public class ExceptionHandlingDemo {
    public static void main(String args[]){
        try {
            int a =100;
            int b= 0;
            System.out.println(a/b);
        } catch (Exception e) {
            System.out.println("Caught an exception "+e);
        }
        finally
        {
            System.out.println("This code is executed all the time");
        }
    }
}

public class JavaMethodsExample {

    public static void main(String[] args) {
        JavaMethodsExample obj  = new JavaMethodsExample();
        obj.displaynamePrivate();
        obj.displaynamePublic();
        displayMessage();
        displayMessage("Hello World!");
        displayMessage("Hello World!", 100);
    }

    private void displaynamePrivate() {
        System.out.println("I am an instance method :: displaynamePrivate");
    }

    public void displaynamePublic() {
        System.out.println("I am an instance method :: displaynamePublic");
    }

    protected void displaynameProtected() {
        System.out.println("I am an instance method :: displaynameProtected");
    }

    private static void displayMessage() {
        System.out.println("I am a static method");
    }
    private static void displayMessage(String message) {
        System.out.println("I am a static method with message "+ message);
    }
    public static void displayMessage(String message, int value) {
        System.out.println("I am a static method with message "+ message + " "+value);
    }



}

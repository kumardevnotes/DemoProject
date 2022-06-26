public class PrivateAccessclass {
    public static void main(String args[]){
        //myPrivateMethod();
    }

    private void myPrivateMethod() {
        System.out.println("I am a private method and can be accessible within the class only");
    }
    public void myPublicMethod() {
        System.out.println("I am a public method and can be accessible outside the class");
    }
}

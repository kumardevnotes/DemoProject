public class Methods {
    Methods(String message) {
        System.out.println("I am a constructor " + message);
    }
    Methods(){
        System.out.println("I am a constructor ");
    }
    Methods(int value){
        System.out.println("I am a constructor "+value);
    }
    public static void main(String[] abc){
      // Methods obj1 = new Methods("Hello");
        //Methods obj3 = new Methods(100);
        Methods obj2 = new Methods();
        System.out.println(obj2.getSalary());
        System.out.println(obj2.getSalary(1000));
    }
    public int getSalary(){
        return 10000;
    }
    public boolean isMarried(){
        return false;
    }
    public int getSalary(int incentive){
        return 10000 + incentive;
    }
    public void displayName(){
        System.out.println("displayName with returntype void");
    }
    public String getName(){
        return "Kumar";
    }

}

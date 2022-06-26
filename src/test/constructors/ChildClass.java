package src.test.constructors;

public class ChildClass extends ParentClass {
    ChildClass(){
        super();
        System.out.println("ChildClass.constructor is executed upon new object creation");
    }
    public static void main(String args[]){
        ChildClass myObj  = new ChildClass();
    }
}

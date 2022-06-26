package src.test.methodoverloading;

public class ChildClass extends ParentClass{
    int count=0;
    public static void main(String args[]){
        ChildClass myObj = new ChildClass();
        myObj.displayCityNames();
        System.out.println(myObj.addValues(100,200));
        System.out.println(myObj.addValues(100,200, 300));
        myObj.increaseCount();
    }

    public void increaseCount(){
       this.count=100;
       super.count = 200;
        System.out.println(this.count);
        System.out.println(super.count);
    }

    public int addValues(int a, int b){
       return a+b;
    }

    public int addValues(int a, int b, int c){
        return a+b+c;
    }

    public void addValues(int a){
        System.out.println(100+ a);
    }
}

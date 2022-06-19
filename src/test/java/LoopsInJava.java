public class LoopsInJava {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        //We will discuss loops with break statement
        for (int i = 1; i <= 3; i++) { //outer for loop
            for (int j = 1; j <= 3; j++) { //inner forloop
                System.out.println(i + " " + j);
            }
        }

        int arr[]={100,200,300,404,506};
        for(int i:arr){
            System.out.println(i);
        }

        //infinite loop
        for(;;){
            System.out.println("infinitive loop");
        }
    }
}

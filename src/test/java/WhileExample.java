import java.util.Scanner;

public class WhileExample {
    public static void main(String args[]) {
        int count = 1;
        while (count < 5) { // 5 < 5 == false
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the valid rollNumer");
            int rollNum = scanner.nextInt();
            System.out.print("The given rollNum is " + rollNum+ "\t");
            count++;
        }
    }
}

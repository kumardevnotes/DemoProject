public class ConditionalStatements {
    public static void main(String args[]) {
        int age = 10;

        if (age > 18 && age < 60) { // 61 > 18  == false &&  61 < 60 = false ==  false
            System.out.println("You are allowed to vote but not allowed for pension");
        } else if (age > 18 && age > 60) { // 61 > 18 = true && 61 > 60= true  =  true
            System.out.println("You are allowed to vote and allowed for pension");
        } else {
            System.out.println("your neither allowed to vote nor take pension");
        }

    }
}

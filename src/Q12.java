public class Q12 {
    //Write a java program to demonstrate if else statement.
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);

        if (age < 18) {
            System.out.println("You aren't eligible :(");
        } else {
            System.out.println("You are eligible :)");
        }
    }
}
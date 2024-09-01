public class Q13 {
    //Write a java program to check whether the given number (enter the number using command line argument) is divisible by 5 and 7.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if ((num % 5 == 0) && (num %7 == 0)) {
            System.out.println("The entered number is divisible by 5 & 7");
        } else {
            System.out.println("The entered number isn't divisible by 5 & 7");
        }
    }    
}
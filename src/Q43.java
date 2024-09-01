public class Q43 {
    //Write a java program to calculate the sum of odd digits of a given number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        if (num % 2 != 0) {
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            System.out.println("The sum of digits is: " + sum);
        }
    }
}
public class Q42 {
    //Write a java program to sum the digits of a number if the entered number is prime number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 2;
        int temp = 0;

        while (i <= Math.sqrt(num)) {
            if (num % i == 0) {
                temp = 1;
            }
            i++;
        }
        if (temp == 0) {
            int sum = 0;
            while (num > 0) {
                int rem = num % 10;
                sum += rem;
                num /= 10;
            }
            System.out.println("The sum of digits is: " + sum);
        }
    }
}
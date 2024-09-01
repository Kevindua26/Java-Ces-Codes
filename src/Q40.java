public class Q40 {
    //Write a java program to check whether the given number is prime number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 2;
        int temp = 0;

        while (i < Math.sqrt(num)) {
            if (num % i == 0) {
                temp = 1;
            }
            i++;
        }
        if (temp == 1) {
            System.out.println("'" + num + "' is not a prime number.");
        } else {
            System.out.println("'" + num + "' is a prime number");
        }
    }
}
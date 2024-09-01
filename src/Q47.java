public class Q47 {
    //Write a java program to check whether an entered number is a armstrong number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int numCopy = num;
        int Sum = 0;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            count++;
            num /= 10;
        }
        num = numCopy;

        while (num > 0) {
            int power = 1;
            int res = num % 10;
            for (int i = 1; i <= count; i++) {
                power *= res;
            }
            Sum += power;
            num /= 10;
        }
        if (Sum == numCopy) {
            System.out.println(numCopy + " is an Armstrong Number");
        } else {
            System.out.println(numCopy + " is not an Armstrong Number");
        }
    }
}
public class Q44 {
    //Write a java program to check whether an entered number is a perfect number or not.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int i = 1;
        int res = 0;
        while (i <= num / 2){
            if (num % i == 0) {
                res += i;
            }
            i++;
        }
        if (res == num) {
            System.out.println("The number '" + num + "' is a perfect number.");
        } else {
            System.out.println("The number '" + num + "' is not a perfect number.");
        }
    }
}
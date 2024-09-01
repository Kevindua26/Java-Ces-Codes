public class Q39 {
    //Write a java program to reverse a number without using any inbuilt function.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int accNum = num;

        int ans = 0;

        while (num > 0) {
            int rem = num % 10;
            num /= 10;

            ans = ans * 10 + rem; //a OR System.out.print("rem");
        }
        System.out.println("The reverse of " + accNum + " is " + ans);
    }
}
public class Q20 {
    //Write a java program to swap two numbers without the help of the third variable.
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("A = " + a + "\nB = " + b);
    }
}
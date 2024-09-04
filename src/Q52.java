public class Q52 {
    //Write a java program to demonstrate return statement.
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = Sum(a, b);

        System.out.println(sum);
    }
    static int Sum(int a, int b) {
        return a+b;
    }
}
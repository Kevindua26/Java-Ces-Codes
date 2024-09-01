public class Q17 {
    //Write a java program to find greatest among the three given numbers( enter number using command line argument).
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        System.out.println("Greatest among these is: " + max);
    }
}
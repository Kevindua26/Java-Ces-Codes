public class Q29 {
/*
    Write a java program to print the pattern using nested for loop.
    *
    **
    ***
    ****
    *****
*/

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
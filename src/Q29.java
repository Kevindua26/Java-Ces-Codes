public class Q29 {
/*
    Write a java program to print the pattern using nested for loop.
    *****
    ****
    ***
    **
    *
*/
    public static void main(String[] args) {
        int n = 5;

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
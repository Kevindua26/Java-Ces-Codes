public class Q31 {
/*
    Write a java program to print the pattern in reverse order using nested for loop.
    55555
    4444
    333
    22
    1
*/
    public static void main(String[] args) {
        int n = 5;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n-row; col++) {
                System.out.print(n-row);
            }
            System.out.println();
        }
    }
}
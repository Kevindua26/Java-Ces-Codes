public class Q30 {
/* 
    Write a java program to print the pattern using nested for loop.
    1
    22
    333
    4444
    55555
*/
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(row+1);
            }
            System.out.println();
        }
    }
}
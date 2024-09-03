public class Q32 {
/*
    Write a java program to print the pattern using nested for loop.
  1
  12
  123
  1234
  12345
*/
    public static void main(String[] args) {
        int n = 5;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}
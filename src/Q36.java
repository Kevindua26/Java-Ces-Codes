public class Q36 {
/*
    Write a java program to print the pattern using nested for loop.
    *******
     *****
      ***
       *
       *
      ***
     *****
    *******
*/
    public static void main(String[] args) {
        int n = 5;

        for (int row = 1; row < 2*n; row++) {

            int spaces = row>n?2*n-row-1:row-1;
            int stars = row>n?(row-n)*2+1:(n-row)*2+1;

            //print spaces
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            //print stars
            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Q34 {
/*
    Write a java program to print the pattern using nested for loop.
          *
        ***
      *****
    *******
*/   
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        for (i = 0; i < n; i++) { 
        for (j = 2 * (n - i); j >= 0; j--) { //For Loop for Row
            System.out.print(" "); // Print Spaces
        }
        for (j = 0; j <= i; j++) { //For Loop for col
            System.out.print("* "); // Print Star
        }
        System.out.println();
        }
    }
}
public class Q19 {
    //Write a java program to display the number of days in a month according to the entered month number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        if (num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12 ) {
            System.out.println("Number of days 31");
        } else if (num == 2) {
            System.out.println("Number of days are 28 and in leap year 29");
        } else if (num == 4 || num == 6 || num == 9 || num == 11) {
            System.out.println("Number are days are 30");
        } else {
            System.out.println("Enter between 1-12");
        }
    }
}
public class Q14 {
    //Write a java program to check whether the year is leap year or not.
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);

        if( (year % 4 == 0 && year != 100) || (year % 400 == 0) ){
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " isn't a Leap Year");
        }
    }
}
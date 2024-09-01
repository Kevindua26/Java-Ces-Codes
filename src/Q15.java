public class Q15 {
    /* 
        Write a java program to get the marks of 5 subjects through command line argument. Calculate marks percentage and display the grade of students as per the following criteria :-
        Percentage >= 70 (Distinction)
        Percentage >= 60 (First Class)
        Percentage >= 50 (Higher Second Class)
        Percentage >= 40 (Second Class)
        Percentage <= 40 (Fail)
    */
    public static void main(String[] args) {
        int cal = Integer.parseInt(args[0]);

        if (cal >= 70) {
            System.out.println("Pass, you got First Class, TOPER");
        } else if (cal >= 60) {
            System.out.println("Pass, you got First Class");
        } else if (cal >= 50) {
            System.out.println("Pass, you got Higher Second Class");
        } else if (cal >= 40) {
            System.out.println("Pass, you got Second Class");
        } else {
            System.out.println("Better luck next time");
        }
    }
}
/*
    public class Q6 {
        public static final int Max_Value = 100;
        public static void main(String[] args) {
            Max_Value = Max_Value + 1;
            System.out.println("The maximum value is: " + Max_Value);
        }
    }
*/

//Write a java program to demonstrate constant variables.
public class Q6 {
    public static final int Max_Value = 100;
    public static void main(String[] args) {
        System.out.println("The final maximum value is: " + Max_Value);
        int Max_Value = 100;
        Max_Value = Max_Value + 1;
        System.out.println("The maximum value is: " + Max_Value);
    }
}
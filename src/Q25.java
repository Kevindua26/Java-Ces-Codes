public class Q25 {
    //Write a java program to demonstrate do while loop.
    public static void main(String[] args) {
        int num = 5;
        int i = 1;
        System.out.println("Table of " + num);

        do{
            System.out.println(num*i);
            i++;
        } while (i <= 5);
    }
}
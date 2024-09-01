public class Q5 {
    //Write a java program to demonstrate all primitive data types.

    public static void main(String[] args) {
        int rollNo = 64;  //4bytes
        char letter = 'k';  //1byte
        float marks = 98.67f;  //4bytes
        double largeDecimalNumber = 99582.92;  //8bytes
        long largeInteger = 9958292L;  //8bytes
        boolean check = false;

        System.out.println("RollNo.: " + rollNo + "\nLetter: " + letter + "\nMarks: " + marks);
        System.out.println("Large Decimal Number: " + largeDecimalNumber + "\nLarge Integer: " + largeInteger + "\nCheck: " + check);
    }
}
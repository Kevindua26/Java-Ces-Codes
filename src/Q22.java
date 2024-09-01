public class Q22 {
    //Write a java program to display the name of the fruit based on the initial character using the switch case.
    public static void main(String[] args) {
        char initial = args[0].charAt(0);
        switch (initial) {
            case 'a': 
                System.out.println("Apple");
                break;
            case 'b':
                System.out.println("Banana");
                break;
            case 'c':
                System.out.println("Cherry");
                break;
            case 'd':
                System.out.println("Dragon Fruit");
                break;
            default:
                System.out.println("Invalid Info");
        }
    }
}
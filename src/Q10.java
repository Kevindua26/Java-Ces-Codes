public class Q10 {
    //Write a java program to understand logical operations.
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean a = true;
        boolean b = false;
        //And (if both true then true)
        System.out.println("X and Y: " + (x && y));
        System.out.println("X and A: " + (x && a));
        System.out.println("Y and B: " + (y && b));
        System.out.println("Y and X: " + (y && x));
        //Or (if one true then true)
        System.out.println("X and Y: " + (x || y));
        System.out.println("X and A: " + (x || a));
        System.out.println("Y and B: " + (y || b));
        System.out.println("Y and X: " + (y || x));
        //NOT ( Opposite if trye then false vise.versa)
        System.out.println("Not X: " + (!x));
        System.out.println("Not Y: " + (!y));
    }
}
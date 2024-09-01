public class Q41 {
    //Write a java program to print all the prime numbers between an entered range.
    public static void main(String[] args) {
        int ll = Integer.parseInt(args[0]);
        int ul = Integer.parseInt(args[1]);

        for (int j = ll; j <= ul; j++) {
            int i = 2;
            int temp = 0;
            while (i <= Math.sqrt(j)) {
                if (j % i == 0) {
                    temp = 1;
                }
                i++;
            }
            if (temp == 0) {
                System.out.println("'" + j + "' is a prime number.");
            }
        }
    }
}
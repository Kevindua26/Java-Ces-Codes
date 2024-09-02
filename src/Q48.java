public class Q48 {
    //Write a java program to print all the armstrong numbers between a given range(enter the range using command line argument).
    public static void main(String[] args) {
        int ll = Integer.parseInt(args[0]);
        int ul = Integer.parseInt(args[1]);

        for (int i = ll; i <= ul; i++) {
            if (i < 10) {
                int rem = i*i;
                if (rem == i) {
                    System.out.println(i + " is an armstrong number.");
                }
            } else {
                int numCopy = i;
                int Sum = 0;
                int count = 0;

                while (i > 0) {
                    int rem = i % 10;
                    count++;
                    i /= 10;
                }
                i = numCopy;

                while (i > 0) {
                    int power = 1;
                    int res = i % 10;
                    for (int j = 1; j <= count; j++) {
                        power *= res;
                    }
                    Sum += power;
                    i /= 10;
                }

                if (Sum == numCopy) {
                    System.out.println(numCopy + " is an Armstrong Number");
                }
                i = numCopy;
            }
        }
        System.out.println("-> Kaivalaya Dua (0231BCA205)");
    }
}
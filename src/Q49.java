public class Q49 {
    //Write a java program to print n numbers of armstrong numbers from x variable.
    public static void main(String[] args) {
        int ll = Integer.parseInt(args[0]);
        int x = Integer.parseInt(args[1]);
        int counter = 0;

        for (int i = ll; ; i++) {
            if (i < 10) {
                int rem = i*i;
                if (rem == i) {
                    System.out.println(i);
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
                    counter++;
                    System.out.println(numCopy);
                }
                i = numCopy;
            }
            if (counter == x) {
                break;
            }
        }
    }
}
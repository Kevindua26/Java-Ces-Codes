public class Q45 {
    //Write a java program to print all the perfect numbers between a given range(enter the range using command line argument).
        public static void main(String[] args) {
            int ll = Integer.parseInt(args[0]);
            int ul = Integer.parseInt(args[1]);

            for (int i = ll; i <= ul; i++) {
                int j = 1;
                int res = 0;
                while (j <= i / 2){
                    if (i % j == 0) {
                        res += j;
                    }
                    j++;
                }
                if (res == i) {
                    System.out.print(i + "\t");
                }
            }
        }
}
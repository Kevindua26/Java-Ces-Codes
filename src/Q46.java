public class Q46 {
    //Write a java program to print the next 5 perfect numbers from a given perfect number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count = 0;
        for(int i = num; ; i++){
            int res = 0;
            int j = 1;
            while (j <= i / 2){
                if (i % j == 0) {
                    res += j;
                }
                j++;
            }
            if (res == i) {
                System.out.print(i + "\t");
                count ++;
            }
            if (count == 3) {
                break;
            }
        }
    }
}
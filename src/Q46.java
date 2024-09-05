public class Q46 {
    //Q46- Write a java program to print the next 5 perfect numbers from a given perfect number.
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int count = Integer.parseInt(args[1]);
        optimizedCount(num,count);
    }

    static void optimizedCount(int num,int count) {
        int p = 2; //starting with 2 since it is my smallest prime no.

        //according to Mersenne prime,
        //2^(p-1) * 2^p -1 where p and 2^p -1 are prime gives me a perfect number
        int c = 0;
        while(true) {
            // Check if 2^p - 1 is a prime (Mersenne prime)
            //why not check p is prime or not??
            //because we just need to check either of them, as if any of them is true, the other exp. would also be true
            //e.g. if p is prime then (2^p - 1) should be prime, and vice versa.
            if(isPrime((1L<<p) - 1)) {  //(2^p) - 1
                //ok its prime, lets calculate the perfect number
                long perfectNumber = ((1L<<p) - 1) * (1L<<(p-1));
                if(perfectNumber > num) {
                    System.out.println(perfectNumber);
                    c++;
                }

            }
            p++;
            if(c == count) {
                break;
            }

        }

    }
    //optimized version as here we are using 6k method which skips like the multiple of 2,3 ...
    //in the previous unoptimized is prime function we were checking every factor of num
    //from 2 to sqrt(n). But let say we have checked that num is not divisible by 2, does it
    //make any sense to check that num is divisible by any of tha multiple of 2 like 4,6,8
    //the complexity of both methods remains same, but here we are reducing the checks.

    static boolean isPrime(long num) {
        if(num<=1) return false;
        if(num<=3) return true;
        if(num % 2 == 0 || num % 3 == 0) return false;
        //hey we reached here, therefore we know num don't have any factor like 2,3
        //now check for the factors till the sq. root in the incrementation of 6
        for (long i = 5; i*i <= num ; i+=6) {
            //if my num is divisible by 5 or 7
            //then check in the next set
            if(num % i == 0 || num % (i+2) == 0) return false;
        }
        return true;
    }
}

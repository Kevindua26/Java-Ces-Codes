public class Q38 {
    //On the occasion of rakshabandhan the shopper stop announced one offer as follows :-
    //Below 10000 bill discount will be given 50% on the sum of digits of the bill.
    //Above 10000 bill discount will be given as equal to the sum of the bill.
    public static void main(String[] args) {
        int sumAmount = Integer.parseInt(args[0]);

        System.out.println("Total amount: " + sumAmount);

        int bill = sumAmount;
        int sum = 0;
        int n = bill;

        while (n>0) {

            int rem = n%10;
            sum = sum + rem;
            n = n/10;
        }
        float discount = 0;

        if(bill < 10000) {
            discount =  (float)sum /2;
        } else {
            discount = sum;
        }

        float ans = bill - (discount/100 * bill);
        System.out.println("Discount applied: " + discount + "%\nFinal bill: " + ans);
    }
}
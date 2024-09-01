class TestInstance{
    public int inst=100;
}
public class Q7{
    static int m=100; 
    public static void main(String[] args){
        System.out.println("Static variable : " + m);
        TestInstance ti = new TestInstance ();
        System.out.println("Instance variable : " + ti.inst);
    }

    void testmethod(){
        System.out.println("Java program to demonstrate different types of variables.");
        int n=90;
        System.out.println("Local variable in testmethod : "+n);
    }
}
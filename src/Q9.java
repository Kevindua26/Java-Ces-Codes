public class Q9 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int BitwiseAnd = a & b;
            System.out.println("Bitwise And: " + BitwiseAnd);
        int BitwiseOr = a | b;
            System.out.println("Bitwise Or: " + BitwiseOr);
        int BitwiseXor = a ^ b;
            System.out.println("Bitwise Xor: " + BitwiseXor);
        int BitwiseNot = ~ a;
            System.out.println("Bitwise Not of A: " + BitwiseNot);
        int LeftShift = a << 1;
            System.out.println("Left Shift of A: " + LeftShift);
        int RightShift = a >> 1;
            System.out.println("Right shift of A: " + RightShift);
    }
}
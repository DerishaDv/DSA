package Recursion;

public class SetBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countSetBits(n));
    }

    private static int countSetBits(int n) {
        if (n == 0) return 0;
        return (n & 1) + countSetBits(n >> 1);
    }
}

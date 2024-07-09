package Recursion;

public class FindBinaryUsingRecursion {
    public static void main(String[] args) {
        int n = 49;
        System.out.println(findBinary(n));
    }

    private static String findBinary(int n) {
        if (n == 0 || n == 1) return Integer.toString(n);
        return findBinary(n / 2) + n % 2;
    }
}

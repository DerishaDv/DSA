package Recursion;

public class FindNaturalSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(findSum(n));
    }

    private static int findSum(int n) {
        if (n == 1) return 1;
        return n + findSum(n - 1);
    }
}

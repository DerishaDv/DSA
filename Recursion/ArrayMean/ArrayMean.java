package Recursion;

public class ArrayMean {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        double n = arr.length;
        double sum = findSum(arr, 0, n);
        System.out.println("The Mean of the element in the array is " + (sum / n));
    }

    static double findSum(int[] arr, int index, double n) {
        if (index == n) return 0;
        return arr[index] + findSum(arr, index + 1, n);
    }
}

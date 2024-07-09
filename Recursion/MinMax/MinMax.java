package Recursion;

import java.util.Arrays;

public class MinMax {
    static int[] minMax = new int[2];

    public static void main(String[] args) {
        int[] arr = {78, 56, 98, 45, 23, 12, 9, 45, 1};
        minMax[0] = findMin(arr, 0, arr.length);
        minMax[1] = findMax(arr, 0, arr.length);
        System.out.println(Arrays.toString(minMax));
    }

    private static int findMax(int[] arr, int index, int length) {
        if (index == length - 1) return arr[length - 1];
        return Math.max(arr[index], findMax(arr, index + 1, length));
    }

    private static int findMin(int[] arr, int index, int length) {
        if (index == length - 1) return arr[length - 1];
        return Math.min(arr[index], findMin(arr, index + 1, length));
    }
}

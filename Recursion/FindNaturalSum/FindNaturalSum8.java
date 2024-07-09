package Recursion;

import java.util.stream.IntStream;

public class FindNaturalSum {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(IntStream.rangeClosed(1, n).sum());
    }

}

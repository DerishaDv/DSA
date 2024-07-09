package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FibonacciReverse {
    static List<Integer> fibo = new ArrayList<>();

    public static void main(String[] args) {
        int start = 0;
        int n = 14;
        IntStream.range(0, n)
                .mapToObj(i -> fibonacci(start + n - i))
                .forEach(fibo::add);
        System.out.println(fibo);
    }

    private static int fibonacci(int i) {
        if (i <= 1) return i;
        else return fibonacci(i - 1) + fibonacci(i - 2);
    }
}

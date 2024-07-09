package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Fibonacci8 {
  //This is to find the first N fibonacci numbers
    public static void main(String[] args) {
        int n = 14;
        List<Integer> fibos = new ArrayList<>();
        IntStream.range(0, n)
                .mapToObj(FirstNFibonacci::fibonacci)
                .forEach(fibos::add);
        /* Note : In Lambda
            IntStream.rangeClosed(0, n-1)
                     .mapToObj(i->fibonacci(i))
                     .forEach(fibos::add);
        */
        System.out.println(fibos);
    }

    private static int fibonacci(int i) {
        if (i <= 1) return i;
        return fibonacci(i - 1) + fibonacci(i - 2);
    }
}

package Recursion;

import java.util.Optional;

public class FindBinary8 {
    public static void main(String args[]) {
        int n = 49;
        Optional<String> binaryString = findBinary(n);
        binaryString.ifPresent(System.out::println);
    }

    private static Optional<String> findBinary(int n) {
        if (n == 0 || n == 1) return Optional.of(Integer.toString(n));
        return Optional.of(findBinary(n / 2).orElse("") + n % 2);
    }
}

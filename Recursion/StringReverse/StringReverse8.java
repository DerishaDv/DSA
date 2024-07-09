package Recursion;

import java.util.Optional;

public class StringReverse8 {
    public static void main(String[] args) {
        String name = "derisha";
        Optional<String> reversed = reverse(name, 0, name.length());
        reversed.ifPresent(System.out::println);
    }

    private static Optional<String> reverse(String name, int index, int length) {
        if (index == length) return Optional.of("");
        return Optional.of(reverse(name, index + 1, length).orElse("") + name.charAt(index));
    }
}

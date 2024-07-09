package Recursion;

public class StringLength {
    public static void main(String[] args) {
        String name = "Vasantha Kumari";
        System.out.println(length(new StringBuilder(name)));
    }

    private static int length(StringBuilder name) {
        if (name.isEmpty()) {
            return 0;
        }
        // Recursive case: increment index and call recursively
        return 1 + length(name.deleteCharAt(0));
    }
}

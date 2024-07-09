public class StringReverseCollectors{
  public static void main(String[] args) {
        String name = "niwred";
        reverse(name).ifPresent(System.out::println);
    }

    private static Optional<String> reverse(String name) {
        /* Note : mapToObj(i -> name.charAt(name.length() - i)):
               This maps each integer i to the corresponding character in the string,
               effectively reversing the string.
         */
        return Optional.of(IntStream.rangeClosed(1, name.length())
                .mapToObj(i -> name.charAt(name.length() - i))
                .map(Object::toString)
                .collect(Collectors.joining()));

    }

}

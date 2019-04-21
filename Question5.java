import java.util.Arrays;
import java.util.stream.Stream;

public class Question5 {

    public static void main(String[] args) {
        letters("abcdefghi").forEach(s -> System.out.print(" " + s + " "));
    }

    public static Stream<String> letters(String s) {
        return Arrays.stream(s.split(""));
    }
}
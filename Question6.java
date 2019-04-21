import java.util.Arrays;

public class Question6 {

    public static void main(String[] args) {
        System.out.println("isAlphabetic =" + isAlphabetic("hi"));
        System.out.println("isAlphabetic =" + isAlphabetic("how"));

    }

    private static boolean isAlphabetic(String word) {
        long count = Arrays.stream(word.split("")).filter(s ->
                Character.isAlphabetic(s.codePoints().findAny().getAsInt())).count();
        return count == word.length();
    }
    
}
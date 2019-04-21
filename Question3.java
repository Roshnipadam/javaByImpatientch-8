import java.util.Arrays;
import java.util.stream.IntStream;

public class Question3 {
    public static void main(String[] args) {
        int[] values = {1, 2 , 3, 4};
        IntStream streamInt = Arrays.stream(values);
        streamInt.forEach(value -> System.out.print(" " + value + " "));
    }
}
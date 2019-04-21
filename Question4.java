import java.util.stream.Stream;

public class Question4 {

    public static void main(String[] args) {
        Long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 30);
        Stream<Long> longStream = prng(a, c, m);
        longStream.limit(10).forEach(aLong -> System.out.println(aLong));
    }
    //create a pseudo no.
    public static Stream<Long> prng(long a, long c, long m) {
        return Stream.iterate(0L, t -> (t * a + c) % m);

    }

}
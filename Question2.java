import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Question2 {
    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "\\file_path;
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            long timeStart = System.currentTimeMillis();
            long count = stream.filter(s -> s.length() > 10).count();
            long timeStop = System.currentTimeMillis();
            System.out.println("Stream:");
            System.out.println("World >5 :" + count + "  Time: " + (timeStop - timeStart));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            long timeStart = System.currentTimeMillis();
            long count = stream.parallel().filter(s -> s.length() > 10).count();
            long timeStop = System.currentTimeMillis();
            System.out.println("StreamParallel:");
            System.out.println("World >5:" + count + "  Time: " + (timeStop - timeStart));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
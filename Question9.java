import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "text_file_path";
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            IntSummaryStatistics statistics = stream.collect(Collectors.summarizingInt(String::length));
            System.out.print(statistics.getAverage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
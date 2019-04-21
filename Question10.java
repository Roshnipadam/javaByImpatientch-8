import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


    public static void main(String[] args) {
        String fileString = System.getProperty("user.dir") + "txt.file_path";
        IntSummaryStatistics statistics = new IntSummaryStatistics();
        try (Stream<String> stream = Files.lines(Paths.get(fileString))) {
            statistics = stream.collect(Collectors.summarizingInt(String::length));
        } catch (IOException e) {
            e.printStackTrace();
        }
}

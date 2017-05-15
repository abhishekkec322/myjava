import java.util.stream.IntStream;

public class Print100UsingStreamAPI {
    public static void main(String[] args) {
        IntStream.range(1,101).forEach(System.out :: println);
    }
}
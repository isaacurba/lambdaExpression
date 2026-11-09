import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FunctionStream {
    public static void main(String[] args) {


        Function<Integer, Boolean> isEven = (number) -> number % 2 == 0;

        List<Boolean> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9)
                                      .map(isEven)
                                      .toList();

        System.out.println("We Live >> "+numbers);




    }
}

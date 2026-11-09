import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Stream;

public class BifunctionStream {

    public static void main(String[] args) {

        BiFunction<String, Integer, Boolean> validAge = (name, age) -> age >= 18;

        Map<String, Integer> value = Map.of(
                "Isaac", 25,
                "Josiah", 10,
                "Emmanuel", 10,
                "Isreal", 43
        );


        value.forEach((name, age) -> {
            boolean isValid = validAge.apply(name, age);
            System.out.println(name + " is valid age? " + isValid);
        });



    }

}

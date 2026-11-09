import java.util.Map;
import java.util.function.BiConsumer;

public class LamStream {
    public static void main(String[] args) {

        // BI-CONSULMER
        BiConsumer<String, Integer> values = (name, age)->
                System.out.println("My name is " + " and i am " + age + " years old");

        Map<String, Integer> map = Map.of(
                "Isaac", 25,
                "Anthony", 39
        );

//        values.accept(map);
    }
}

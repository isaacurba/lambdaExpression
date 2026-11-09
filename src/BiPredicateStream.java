import java.util.function.BiPredicate;

public class BiPredicateStream {

    public static void main(String[] args) {

        BiPredicate<String, Integer> isLongerThan = (word, max) -> word.length() > max;
        System.out.println(isLongerThan.test("Programming", 5));


    }

}

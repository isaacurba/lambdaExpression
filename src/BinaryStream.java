import java.util.function.BinaryOperator;

public class BinaryStream {

    public static void main(String[] args) {

        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println("Sum = " + add.apply(10, 20));

    }

}

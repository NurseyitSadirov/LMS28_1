import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
       Integer [] array = {2,3,34,45,3,6,12,30};
        Stream<Integer> massive = Stream.of(array);
        Stream<Integer> integerStream = massive.filter(x->x % 2 == 0).map(x-> x * x);
        integerStream.max(Comparator.comparing(x->x)).stream().toList().forEach(System.out::println);


    }

}
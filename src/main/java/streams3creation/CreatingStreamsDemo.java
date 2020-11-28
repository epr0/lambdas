package streams3creation;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreatingStreamsDemo {

    public static void main(String[] args) {
        show();

        Stream stream = Stream.generate(() -> Math.random());
        stream.forEach(n -> System.out.println(n));
        //we need to limit this
        //stream.limit(3).forEach(n -> System.out.println(n));

        Stream.iterate(1, n -> n + 1).limit(10).forEach(n -> System.out.println(n));

        //Move to package 2 for mapping movies

    }

    public static void show() {
        int[] numbers = {1,2,3,4};

        //Consumer takes an object BUT NOT returns a value
        //We pass a consumer here.
        Arrays.stream(numbers).forEach(n -> System.out.println(n));
    }
}

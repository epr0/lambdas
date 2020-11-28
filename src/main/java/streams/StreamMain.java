package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMain {

    public static void main(String[] args) {
        //Stream represents a sequence of elements
        //Helps working or traverse the collections
        //Terminal operations are either void or return type
        //Intermediate operations return the stream itself

        //Common operations include map, filter and foreach
        //sorted and collected
        //sorted - intermediate
        //collected - terminal
        //elements in the stream cannot be changed

        Arrays.asList("Red", "Blue", "Green")
                .stream()
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);

        Stream.of("apple", "cherry", "banana", "potato")
                .filter(fruit -> {
                    return fruit.startsWith("a");//predicate
                })
                //if foreach is removed, nothing will be printed
                //foreach makes it terminal event
                .forEach(fruit -> System.out.println("Starts with A fruit: " + fruit));

        List<String> collected = Stream.of("Java", "Rocks")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(collected.toString());

        //Primitive streams
        IntStream.range(1,4).forEach(System.out::println);

        Arrays.stream(new int[] {1, 2, 3, 4})
                .map(n -> n * n)
                .average()
                .ifPresent(System.out::println);

        Stream.of(1.5, 2.4, 5.6)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);
    }
}

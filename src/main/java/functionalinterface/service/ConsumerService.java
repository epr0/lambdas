package functionalinterface.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsumerService implements LambdaService {

    public void execute() {
        //consumes an argument. Accepts argument but does NOT return the result.
        //only CHANGES the given value.

        Consumer<String> consumerString =
                (givenString) -> System.out.println("[CONSUMER] " + givenString.toLowerCase());

        consumerString.accept("DFDSFfdfdsiIIUndfsOSFDS");

        Consumer<String> anotherConsumer = ConsumerService::printWords;
        anotherConsumer.accept("JAVA");
        anotherConsumer.accept("Cpp");
        anotherConsumer.accept("PHP");

        Map<String, Integer> ages = new HashMap<>();
        ages.put("John", 25);
        ages.put("Freddy", 24);
        ages.put("Samuel", 30);

        ages.forEach((name, age) -> System.out.println(name + " is " + age + " years old"));



        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // implementation of the Consumer's accept methods.
        Consumer<Integer> consumer = (x) -> System.out.println(x);
        forEach(list, consumer);
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }

    public static void printWords(String word) {
        System.out.println(word);
    }

}

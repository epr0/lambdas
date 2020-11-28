package functionalinterface.service;

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
    }

    public static void printWords(String word) {
        System.out.println(word);
    }

}

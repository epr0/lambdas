package lambdas3typeinference;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;

//Infer - daryti isvada
public class TypeInferenceMain {
    public static void main(String[] args) {
        String[] names = { "tom", "bill", "john"};
        System.out.println("First item in the list is - " + getFirst(names));

        Integer[] digits = {4,5,6};
        System.out.println("First item in the list is - " + getFirst(digits));

        //Lambda example
        //Consumer FI that accepts an object but does not return a value
        //Printer via lambda
        Consumer<String> consumer = msg -> System.out.println(msg.length());

        //printed via static method reference
        Consumer<String> staticMethodConsumer = SystemOutPrinter::print;
        //argument is passed via ACCEPT method
        staticMethodConsumer.accept("Tom");

        //Accepts two inputs and produces the result
        BiFunction<Integer, Integer, Integer> integerConsumer = SystemOutPrinter::add;
        int result = integerConsumer.apply(5, 3);
        System.out.println(result);

        //Instance method reference
        //Object has to be created
        SystemOutPrinter systemOutPrinter = new SystemOutPrinter();
        Runnable runnable = systemOutPrinter::nonStaticSayHelloMethod;
        runnable.run();

        CustomFuncInterface customFuncInterface = () -> System.out.println("AAAA!");
        customFuncInterface.shout();



    }

    public static <T> T getFirst(T[] array) {
        return array[0];
    }

}



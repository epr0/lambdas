package lambdas;

import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class LambdaMain {

    public static void main(String[] args) {
        //Methods can be turned into lambdas
        //Data type does not need to be specified
        IntFunction<String> intToString = number -> Integer.toString(number);
        System.out.println(intToString.apply(123).length());

        //expect integer - return string as specified
        IntFunction<String> anotherIntToString = Integer::toString;
        System.out.println(anotherIntToString.apply(1234).length());

        //lambdas made using constructor
        //I will provde STRING , but expect BigInteger as result
        Function<String, BigInteger> convertedBigInt = BigInteger::new;
        BigInteger bigIntegerFromString = convertedBigInt.apply("21");
        System.out.println("Converted value now is " + bigIntegerFromString);
        System.out.println(bigIntegerFromString instanceof BigInteger);

        Consumer<String> printer = System.out::println;
        printer.accept("Lambda stuff");

        Consumer<String> dogPrinter = Dog::bark;
        dogPrinter.accept("WOOF");
    }
}

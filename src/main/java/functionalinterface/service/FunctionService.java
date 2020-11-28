package functionalinterface.service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionService implements LambdaService{
    @Override
    public void execute() {
        //accepts one argument and produces the result.
        //First argument is an INPUT (Type of T input)
        //Second argument is the RESULT (Type of R result)
        Function<String, Integer> converter = (givenString) -> givenString.length();
        System.out.println("[FUNCTION] Length of 1234 is - " + converter.apply("1234"));

        Function<Integer, Integer> multiplier = (givenInput) -> givenInput * 2;
        Integer result = converter.andThen(multiplier).apply("dvigubas");
        System.out.println("[FUNCTION 2] Multiplied length is - " + result);

        Map<String, Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John", s -> s.length());
        System.out.println("[FUNCTION 3] Length of string is - " + value);

        IntFunction<Long> intFunction = (input) -> input * new Long(2);
        System.out.println("[FUNCTION 4] Input produces LONG result " + intFunction.apply(5));
        //intFunction = (input) -> Long.valueOf(input * 2);

        //LongFunction, DoubleFunction...

        //TWO arguments used in FI which starts with BI*
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a * b * 2;
        Integer biFunctionResult = biFunction.apply(4, 4);
        System.out.println("[FUNCTION 5] Two inputs gives the result of - " + biFunctionResult);

    }
}

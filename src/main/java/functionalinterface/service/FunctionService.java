package functionalinterface.service;

import java.util.function.Function;

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
    }
}

package functionalinterface.service;

import java.util.function.BinaryOperator;

public class BinaryOperatorService implements LambdaService {
    @Override
    public void execute() {
        //Accepts TWO arguments, returns one result
        BinaryOperator<Integer> addOperator = (a, b) -> a + b;
        System.out.println("Add 10 + 24: " + addOperator.apply(10,24));
    }
}

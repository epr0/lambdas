package functionalinterface.service;

import java.util.function.UnaryOperator;

public class UnaryOperatorService implements LambdaService {

    @Override
    public void execute() {
        UnaryOperator<String> operator = (message) -> message.toUpperCase();
        System.out.println(operator.apply("Message in UppercAse"));
    }
}

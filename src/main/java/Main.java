import functionalinterface.service.*;

public class Main {

    public static void main(String[] args) {
        LambdaService predicateService = new PredicateService();
        predicateService.execute();

        LambdaService consumerService = new ConsumerService();
        consumerService.execute();

        LambdaService functionService = new FunctionService();
        functionService.execute();

        LambdaService supplierService = new SupplierService();
        supplierService.execute();

        LambdaService binaryOperatorService = new BinaryOperatorService();
        binaryOperatorService.execute();

        LambdaService unaryOperatorService = new UnaryOperatorService();
        unaryOperatorService.execute();

        CustomGreeting customGreeting = message -> System.out.println("My message is - " + message);
        customGreeting.saySomething("I like trains.");
    }
}

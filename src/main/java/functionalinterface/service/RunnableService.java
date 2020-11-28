package functionalinterface.service;

public class RunnableService implements LambdaService {
    @Override
    public void execute() {
        Runnable runnable = () -> System.out.println("No arguments, no return");
        runnable.run();
    }
}

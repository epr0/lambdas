package lambdas4mosh;

public class ConsolerPrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}

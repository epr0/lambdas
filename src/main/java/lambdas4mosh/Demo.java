package lambdas4mosh;

public class Demo {

    public static void main(String[] args) {
        //regular, some times when not reused boiler code
        greet(new ConsolerPrinter());

        //Annonymous inner class
        greet(new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message + " annonymously.");
            }
        });

        //lambda
        greet((message -> System.out.println(message + " lambda")));

        //need to update interface
        //greet((message, number) -> System.out.println(message + " " + number));

        //finally concrete implementation of interface
        Printer printer = message -> System.out.println("hello - " + message);
    }

    private static void greet(Printer printer) {
        printer.print("Hello");
    }
}

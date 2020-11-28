package lambdas3typeinference;

public class SystemOutPrinter {

    public static void print(String name) {
        System.out.println("Hello, " + name);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public void nonStaticSayHelloMethod() {
        System.out.println("Hello...");
    }
}

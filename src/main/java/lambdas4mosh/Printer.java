package lambdas4mosh;

public interface Printer {
    void print(String message);

    default void add(int a, int b) {
        System.out.println(a + b);
    }
}

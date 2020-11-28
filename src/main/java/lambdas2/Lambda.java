package lambdas2;

import java.util.Comparator;
import java.util.function.Predicate;

public class Lambda {

    public static void main(String[] args) {
        //Lambda expression facilitates functional programming,
        // and simplifies the development a lot.
        //LAMDAS used to compact syntax when implementing a FUNCTIONAL INTERFACE
        //Comparison using the annonymous class

        //Why is this cool? It allows you to write quick throw away
        // functions without naming them.
        // It also provides a nice way to write closures.
        // With that power you can do things like this.

        // The following is an example of Predicate :
        // a functional interface that takes an argument
        // and returns a boolean primitive type.

        Predicate<Integer> pred = x -> x % 2 == 0; // Tests if the parameter is even.
        boolean result = pred.test(4); // true
        System.out.println(result);

        Comparator<Employee> byName = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };

        //converted to lambda expression
        //parameter list arrow and body of abstract method
        //works for functional interfaces only with on abstract method
        Comparator<Employee> byNameLamda =
                (Employee e1, Employee e2) -> {return e1.getName().compareTo(e2.getName()); };

        //simplified
        Comparator<Employee> byNameLamda2 =
                (Employee e1, Employee e2) -> e1.getName().compareTo(e2.getName());

        //more simplified
        Comparator<Employee> byNameLamda3 =
                (e1,e2) -> e1.getName().compareTo(e2.getName());

        //expression with no parameters
        Runnable r = () -> { System.out.println("Kompaktiskas runnable"); };
        new Thread(r).start();

        //No need to even mention Runnable
        new Thread( () -> { System.out.println("Another runnable"); } ).start();

        //No need braces
        Thread thread = new Thread(   () -> System.out.println("Hello thread")   );
        thread.start();

    }
}

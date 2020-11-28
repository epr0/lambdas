package functionalinterface.service;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//The reason it's called a "functional interface"
// is because it effectively acts as a function.
//Can have only one abstract method and lots of default implementations.
public class PredicateService implements LambdaService {

    public void execute() {
        //naming should relate to the context we are checking
        //Predicate - boolean (returns true or false) value function of SINGLE argument.
        // Since this is interface we have to override the method with logic.
        // (s) -> s.length() > 10 || (given object) -> predicate logic.
        Predicate<String> longerThanTen = (givenString) -> givenString.length() > 10;
        boolean isStringLongerThanTen = longerThanTen.test("TestEilute");
        System.out.println("[PREDICATE] Test string is longer than 10 symbols - " + isStringLongerThanTen);

        List<String> names = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David");

        List<String> namesWithA = names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("[PREDICATE 1] " + namesWithA);

    }

}

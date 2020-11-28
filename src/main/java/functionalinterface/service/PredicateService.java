package functionalinterface.service;


import java.util.function.Predicate;

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
    }

}

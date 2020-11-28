# Lambdas
A lambda expression is a short block of code which takes in parameters and returns a value.
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

Before Java 8, you would usually create a class for every case where you needed to encapsulate a single piece of functionality. 
This implied a lot of unnecessary boilerplate code to define something that served as a primitive function representation.

Java 8 added two new packages - util.stream and util.function

# Functional interface 
defined as interface which contains ONE abstract function.
Represents abstract concepts such as functions, actions or predicates.

1. Predicate - boolean value function of one argument. Since this is interface we have to override the method with logic.
2. Consumer - consumes an argument. Accepts argument but does not return the result.
3. Function - accepts one argument and produces the result.
4. Supplier - represents a supplier of results.
5. UnaryOperator - single argument with a return value.
6. BinaryOperator - takes two arguments and returns one.

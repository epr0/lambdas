# lambdas

Lambdas.

Functional interfaces.

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

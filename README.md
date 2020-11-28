# lambdas

Lambdas.

Functional interfaces.

Java 8 added two new packages - util.stream and util.function

Functional interface - defined as interface which contains ONE abstract function.
Represents abstract concepts such as functions, actions or predicates.

Predicate - boolean value function of one argument. Since this is interface we have to override the method with logic.
Consumer - consumes an argument. Accepts argument but does not return the result.
Function - accepts one argument and produces the result.
Supplier - represents a supplier of results.
UnaryOperator - single argument with a return value.
BinaryOperator - takes two arguments and returns one.

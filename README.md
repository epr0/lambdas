# Lambdas
A lambda expression is a short block of code which takes in parameters and returns a value.
Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.

Before Java 8, you would usually create a class for every case where you needed to encapsulate a single piece of functionality. 
This implied a lot of unnecessary boilerplate code to define something that served as a primitive function representation.

Java 8 added two new packages - util.stream and util.function

# Functional interface 

Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as lambda expressions.

Or defined as interface which contains ONE abstract function.
Represents abstract concepts such as functions, actions or predicates.

1. Predicate[InputType] - Accepts ONE argument returns boolean type result. In mathematical logic, a predicate is a function that receives a value and returns a boolean value.
2. Consumer [InputType] - Opposed to Supplier. Accepts ONE argument but does NOT return the result.
3. Function [InputType, OutputType] - accepts ONE argument and produces ONE result.
4. Supplier [OutputType] - does NOT accept arguments and produces ONE result.
5. UnaryOperator - single argument with a return value.
6. BinaryOperator - takes two arguments and returns one.

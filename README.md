# Java Lambda Expression

### How to define lambda expression?
```java
// The new operator (->) used is known as an arrow operator or a lambda operator.
 (parameter list) -> lambda-body 
 ```
## Lambda is an anonymous function
- No name, no modifier, no return type
- Use only with `FunctionalInterfaces`

## Benefits of Lambda
- Enables functional programming.
- Reduces the lines of code.
- Sequential and Parallel execution (support by passing behavior as an argument in methods)
- To call APIs very effectively 
- To write more `readable`, `maintainable` and `concise` code.

## Rules of Lambda
- If the body of Lambda expression contains only one statement then curly braces are `optional`
- Java compiler also infer the type of variable passed in arguments, hence the parameter type is also `optional` 
- Sample
```java
    (x) -> System.out.println(x);
```
## Functional Interface or SAM (Single abstract method) interface
- A functional interface is an interface that contains only one abstract method. Ex: `Runnable`, `Callable`, `Comparable` etc.
- It may contains any number of `static` and `default` methods
- To call lambda we require functional interface.
- `Lambda` is used to `implement functional interface` in very `simple` and `short` manners.
- `@FunctionalInterface` annotation is used to `mark` an interface as functional interface. 

```java
// SAM : Single Abstract Method Interfaces
interface Square {
    int calculate(int x);
}

@FunctionalInterface // This annotation helps only to raise warring in case of multiple abstract methods while targeting the FM.
public interface Foo {
    String method(String string);

    //It may contains any number of `static` and `default` methods
    default String getVersion()  { return "1.4.0"; }
    static int add(int a, int b) { return a + b;   }
}
```
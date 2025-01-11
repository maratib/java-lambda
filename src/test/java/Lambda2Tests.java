import org.junit.jupiter.api.Test;

//It can be used without annotation, its a good practice to use annotation for functional interface for clarity.
@FunctionalInterface
interface FInterface {
    void m();
     //It may contains any number of `static` and `default` methods
     default String getVersion()  { return "1.4.0"; }
     static int add(int a, int b) { return a + b;   }
}

interface InnerLambda extends FInterface {
    default String getNewVersion()  { return "1.4.1"; }
    
}

public class Lambda2Tests {
    
    @Test
    public void lambdaTest() {
        FInterface i = () -> System.out.println("Hello with Lambda!");
        i.m();
        System.out.println(i.getVersion());
        System.out.println(FInterface.add(4, 4));
    }
    @Test
    public void lambdaInheritedTest() {
        InnerLambda i = () -> System.out.println("Hello with Lambda!");
        i.m();
        System.out.println(i.getVersion());
        System.out.println(i.getNewVersion());
        // System.out.println(InnerLambda.add(4, 4)); // static method add is not inherited
    }
    @Test
    public void preLambdaTest() {
        var i = new FInterface() { //inline implementation of interface
            @Override
            public void m() {
                System.out.println("Hello without Lambda!");
            }
        };

        i.m();
        
    }
}

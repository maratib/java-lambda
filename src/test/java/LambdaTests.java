import org.junit.jupiter.api.Test;

public class LambdaTests {

    @Test
    public void lambdaTest1() {
        // System.out.println("Hello from Test1");
        lambdaPrint(() -> System.out.println("Hello Lambda!"));

        var lambda1 = (LambdaPrint) () -> System.out.println("Hello Lambda1");
        LambdaPrint lambda2 = () -> System.out.println("Hello Lambda2");
        lambda1.print();
        lambda2.print();

    }

    private void lambdaPrint(LambdaPrint print) {
        print.print();
    }

}

@FunctionalInterface
interface LambdaPrint {
    public void print();
}

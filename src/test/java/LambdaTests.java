import org.junit.jupiter.api.Test;

public class LambdaTests {

    @Test
    public void lambdaTest1() {
        // System.out.println("Hello from Test1");
        lambdaPrint(() -> System.out.println("Hello Lambda!"));

        var lambda1 = (MyInter) () -> System.out.println("Hello Lambda1");
        MyInter lambda2 = () -> System.out.println("Hello Lambda2");
        lambda1.sayHello();
        lambda2.sayHello();

        System.out.println(lambda2.getVersion());
        System.out.println(MyInter.add(4, 4));

    }

    private void lambdaPrint(MyInter myInter) {
        myInter.sayHello();
    }

}

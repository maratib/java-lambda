
@FunctionalInterface
public interface MyInter {
    public void sayHello();

    default String getVersion() {
        return "1.4.0";
    }

    static int add(int a, int b) {
        return a + b;
    }
}

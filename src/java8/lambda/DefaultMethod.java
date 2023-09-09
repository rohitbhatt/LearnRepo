package java8.lambda;
public class DefaultMethod {
    public static void main(String[] args) {
        DefaultMethodInt.meth3();
    }
}

interface DefaultMethodInt {
    public void meth1();
    public default void meth2() {
        System.out.println("default method");
    };
    public static void meth3() {
        System.out.println("static method");
    };
}

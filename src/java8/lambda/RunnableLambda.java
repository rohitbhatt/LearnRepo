package java8.lambda;

public class RunnableLambda {
    public static void main(String[] args) {
        System.out.println("main "+Thread.currentThread());
        Thread th = new Thread(() -> System.out.println("Lambda "+Thread.currentThread()));
        th.start();
    }
}

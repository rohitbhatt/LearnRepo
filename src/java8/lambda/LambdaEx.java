package java8.lambda;

public class LambdaEx {

    public static void main(String[] args) {
        Greeting greetLambda = () -> System.out.println("Hello Lambda");
        Greeting greetAnonymous = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello Annonymous");
            }
        };

        greetLambda.perform();;
        greetAnonymous.perform();

        System.out.println(greetLambda);
        System.out.println(greetAnonymous);

        System.out.println(greetLambda.hashCode());
        System.out.println(greetAnonymous.hashCode());

        System.out.println(greetLambda instanceof Greeting);
        System.out.println(greetAnonymous instanceof Greeting);
    }
}

interface Greeting {
    void perform();
}

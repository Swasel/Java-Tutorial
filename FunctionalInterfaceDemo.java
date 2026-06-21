@FunctionalInterface
interface MyInterface {
    void display();
}

@FunctionalInterface
interface Calculator {
    int add(int a, int b);
}

// Traditional implementation
class Demo implements MyInterface {
    public void display() {
        System.out.println("Hello from Traditional Implementation");
    }
}

public class FunctionalInterfaceDemo{
    public static void main(String[] args) {

        // 1. Traditional implementation
        Demo d = new Demo();
        d.display();

        // 2. Lambda expression
        MyInterface obj = () -> {
            System.out.println("Hello from Lambda Expression");
        };
        obj.display();

        // 3. Functional interface with parameters
        Calculator calc = (a, b) -> a + b;

        int result = calc.add(10, 20);
        System.out.println("Sum = " + result);
    }
}
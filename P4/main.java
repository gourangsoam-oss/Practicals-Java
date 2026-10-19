
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of two integers: "
                + calc.add(10, 20));

        System.out.println("Sum of three integers: "
                + calc.add(10, 20, 30));

        System.out.println("Sum of two decimals: "
                + calc.add(5.5, 4.5));
    }
}


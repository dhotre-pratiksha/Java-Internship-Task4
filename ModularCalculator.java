import java.util.Scanner;

public class ModularCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number : ");
        double a = sc.nextDouble();

        System.out.print("Enter 2nd number : ");
        double b = sc.nextDouble();

        System.out.println("\nAddition : " + add(a, b));
        System.out.println("Subtraction : " + subtract(a, b));
        System.out.println("Multiplication : " + multiply(a, b));

        try {
            System.out.println("Division : " + divide(a, b));
        }
        catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }

        System.out.println("\nOverloaded Add (int) : " + add(5, 10));
        System.out.println("Overloaded Add (double) : " + add(5.5, 2.5));

        // Pass by value demonstration
        int x = 10;
        System.out.println("\nBefore method call : " + x);
        changeValue(x);
        System.out.println("After method call : " + x);

        sc.close();
    }

    static double add(double x, double y) {
        return x + y;
    }

    static int add(int x, int y) {
        return x + y;
    }

    static double subtract(double x, double y) {
        return x - y;
    }

    static double multiply(double x, double y) {
        return x * y;
    }

    static double divide(double x, double y) {
        if (y == 0) {
            throw new ArithmeticException("Division by zero not allowed!!!");
        }
        return x / y;
    }

    static void changeValue(int num) {
        num = num + 20;
    }
}

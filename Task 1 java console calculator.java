import java.util.Scanner;
public class Calculator {
    public static double add(double a, double b) {
        return a + b;
    }
    public static double subtract(double a, double b) {
        return a - b;
    }
    public static double multiply(double a, double b) {
        return a * b;
    }
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean again = true;
        System.out.println("===== Java Console Calculator =====");
        while (again) {
            System.out.print("\nEnter first number: ");
            double num1 = sc.nextDouble();
            System.out.print("Enter operator (+, -, *, /): ");
            char op = sc.next().charAt(0);
            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();
            double result;
            switch (op) {
                case '+':
                    result = add(num1, num2);
                    break;
                case '-':
                    result = subtract(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }
            System.out.println("Result: " + result);
            System.out.print("Do you want to calculate again? (yes/no): ");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                again = false;
            }
        }
        sc.close();
        System.out.println("Calculator closed.");
    }
}
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

            System.out.print("Enter operation (+, -, *, /): ");
        char op = input.next().charAt(0);

        double result = 0;
        boolean valid = true;

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

    

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            if (b != 0) {
                result = a / b;
            } else {
                System.out.println("Cannot divide by zero!");
                valid = false;
            }
        } else {
            System.out.println("Invalid operation!");
            valid = false;
        }

        if (valid) {
            System.out.println("Result: " + result);
        }
    }
}

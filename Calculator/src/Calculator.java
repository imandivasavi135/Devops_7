import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Display menu
        System.out.println("Simple Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1/2/3/4): ");
        
        // Get the choice of operation
        int choice = scanner.nextInt();

        // Get two numbers for the operation
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Declare a variable to store the result
        double result;

        // Perform the chosen operation using a switch-case statement
        switch (choice) {
            case 1: // Addition
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case 2: // Subtraction
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case 3: // Multiplication
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case 4: // Division
                // Check if second number is zero to avoid division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid operation choice.");
        }

        // Close the scanner
        scanner.close();
    }
}
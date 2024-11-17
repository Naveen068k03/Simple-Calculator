import java.util.Scanner;

public class java_project3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Prompt the user for two numbers and an operation
            System.out.print("Enter the first number: ");
            double num1 = getValidNumber(scanner); // Ensuring valid number input

            System.out.print("Enter the second number: ");
            double num2 = getValidNumber(scanner); // Ensuring valid number input

            System.out.print("Enter the operation (+, -, *, /): ");
            String operation = scanner.nextLine();

            // Perform the operation and display the result
            double result = 0.0;
            boolean validOperation = true;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Cannot divide by zero.");
                        validOperation = false;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operation.");
                    validOperation = false;
            }

            // Display the result if the operation was valid
            if (validOperation) {
                System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
            }

            // Ask if the user wants to continue or exit
            System.out.print("\nDo you want to perform another calculation? (yes/no): ");
            String continueCalculation = scanner.nextLine().toLowerCase();
            if (continueCalculation.equals("no")) {
                System.out.println("Exiting the Simple Calculator.");
                break; // Exit the program
            }
        }

        scanner.close(); // Close the scanner resource
    }

    // Method to validate that the input is a valid number
    public static double getValidNumber(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                return Double.parseDouble(input); // Attempt to parse the input as a number
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}

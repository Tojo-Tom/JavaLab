import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        System.out.print("A=");
        int a = scanner.nextInt();

        System.out.print("B=");
        int b = scanner.nextInt();

        int result = 0;
        boolean isValid = true;

        switch (choice) {
            case 1:
                result = a + b;
                break;
            case 2:
                result = a - b;
                break;
            case 3:
                result = a * b;
                break;
            case 4:
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("\nError: Cannot divide by zero.");
                    isValid = false;
                }
                break;
            default:
                System.out.println("\nInvalid choice. Please select a number between 1 and 4.");
                isValid = false;
        }

        if (isValid) {
            System.out.println("\nOutput");
            System.out.println("Result = " + result);
        }
    }
}
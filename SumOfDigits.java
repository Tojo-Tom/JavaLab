import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number = ");
        int number = scanner.nextInt();
        int sum = 0;
        int tempNumber = Math.abs(number);
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum = sum + digit;
            tempNumber = tempNumber / 10;
        }

        System.out.println("\nOutput");
        System.out.println("Sum of digits = " + sum);
    }
}
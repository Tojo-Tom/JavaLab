import java.util.Scanner;
public class SalaryCounter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        double da = basicSalary * 0.10;


        double hra = basicSalary * 0.15;


        double grossSalary = basicSalary + da + hra;


        System.out.println("\nOutput");
        System.out.println("DA = " + (int) da);
        System.out.println("HRA = " + (int) hra);
        System.out.println("Gross Salary = " + (int) grossSalary);
    }

}


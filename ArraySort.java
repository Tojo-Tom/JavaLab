import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();


        int[] array = new int[n];

        System.out.println("Array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        Arrays.sort(array);


        System.out.println("\nOutput");
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }


        System.out.println();

    }
}
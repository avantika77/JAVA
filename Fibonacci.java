import java.util.Scanner;

public class Fibonacci {
    // Method to compute the nth Fibonacci number using recursion
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of terms
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Print the Fibonacci series up to the nth term
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        // Close the scanner
        scanner.close();
    }
}

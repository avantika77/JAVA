import java.io.*;

class Factorial {
    static int even(int n) {
        if (n <= 0)
            return 0;
        int fib[] = new int[2 * n + 1];
        fib[0] = 0;
        fib[1] = 1; // Changed fib[1] to 1 as it's the second Fibonacci number
        int s = 0;
        for (int j = 2; j <= 2 * n; j++) { // Fixed syntax for the for loop
            fib[j] = fib[j - 1] + fib[j - 2]; // Corrected Fibonacci calculation
            if (j % 2 == 0)
                s += fib[j];
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 11;
        System.out.println("Even sum of fibonacci numbers up to " + n + " is " + even(n)); // Fixed the output message
    }
}
============================================================================================================================================
The task is to find only F2n+1 -1.
============================================================================================================================================ 

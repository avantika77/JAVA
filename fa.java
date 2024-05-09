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
// Java Program to find even indexed
// Fibonacci Sum in O(Log n) time.

class GFG {

	static int MAX = 1000;

	// Create an array for memoization
	static int f[] = new int[MAX];

	// Returns n'th Fibonacci number
	// using table f[]
	static int fib(int n)
	{
		// Base cases
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return (f[n] = 1);
		}

		// If fib(n) is already computed
		if (f[n] == 1) {
			return f[n];
		}

		int k = (n % 2 == 1) ? (n + 1) / 2 : n / 2;

		// Applying above formula [Note value n&1 is 1
		// if n is odd, else 0].
		f[n] = (n % 2 == 1)
				? (fib(k) * fib(k)
					+ fib(k - 1) * fib(k - 1))
				: (2 * fib(k - 1) + fib(k)) * fib(k);

		return f[n];
	}

	// Computes value of even-indexed Fibonacci Sum
	static int calculateEvenSum(int n)
	{
		return (fib(2 * n + 1) - 1);
	}

	// Driver program to test above function
	public static void main(String[] args)
	{
		// Get n
		int n = 11;

		// Find the alternating sum
		System.out.println(
			"Even indexed Fibonacci Sum upto " + n
			+ " terms: " + calculateEvenSum(n));
	}
}
_____________________
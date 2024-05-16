#factorial =The factorial of a non-negative integer 𝑛n, denoted as 𝑛! is the product of all positive integers less than or equal to 𝑛.
 n!=n×(n−1)×(n−2)×…×
             3×2×1

 import java.util.Scanner;
class fac {     //class factorial
    static int factorial(int n) // n parameter
    {
        int res = 1; // res will be 1 not 0
        for (int i = 2; i <= n; i++) {      // loop till n value
            res *= i;                         // res *= 2, res becomes 2. // res *= 3, res becomes 6.
        }
        return res;    // return res
    }
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Invalid input.");
        } else {
            System.out.println("Factorial : " + factorial(n));
        }
 }
}

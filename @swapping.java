// Java Program to Swap Two values using third variable
🔸// using temp variable 
import java.util.*;

class Swap{
	static void swapUsingcatalyst(int m, int n)
	{
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
	}
	public static void main(String[] args)
	{
		int m = 9, n = 5;
		swapUsingcatalyst(m, n);
	}
}
================================================================================================================================================
Value of m is 5 and Value of n is 9
================================================================================================================================================

  🔸// without using temporary third or catalyst variable
  
import java.util.*;
class Swap{
	static void swapUsingcatalyst(int m, int n)
	{
	 m=m-n;
		n=m+n;
		m=n-m;
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
	}
	public static void main(String[] args)
	{
		int m = 9, n = 5;
		swapUsingcatalyst(m, n);
	}
}
================================================================================================================================================
  Value of m is 5 and Value of n is 9

 ================================================================================================================================================
🔸//using bitwise operator ^
  
import java.util.*;
class Swap{
	static void swapUsingcatalyst(int m, int n)
	{
	 	m=m^n;
		n=m^n;
		m=m^n;
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
	}
	public static void main(String[] args)
	{
		int m = 9, n = 5;
		swapUsingcatalyst(m, n);
	}
}
================================================================================================================================================
  Value of m is 5 and Value of n is 9

 ================================================================================================================================================
🔸//using arithmetic operator
  import java.util.*;

class Swap{
	static void swapUsingcatalyst(int m, int n)
	{
		m=(m+n)-(n=m);
		System.out.println("Value of m is " + m
						+ " and Value of n is " + n);
	}
	public static void main(String[] args)
	{
		int m = 9, n = 5;
		swapUsingcatalyst(m, n);
	}
}
================================================================================================================================================
  Value of m is 5 and Value of n is 9
  ================================================================================================================================================
🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
using scanner class for user input value 
import java.util.Scanner;
public class SwapNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number (m): ");
        int m = scanner.nextInt();
        System.out.print("Enter the second number (n): ");
        int n = scanner.nextInt();

        System.out.println("Before swapping:");
        System.out.println("Value of m is " + m + " and Value of n is " + n);

        // Swapping the numbers
        int temp = m;
        m = n;
        n = temp;

        System.out.println("After swapping:");
        System.out.println("Value of m is " + m + " and Value of n is " + n);

        scanner.close();
    }
}

  

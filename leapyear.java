to//1.using ternary operator 
import java.io.*;
public class check {
	public static void isLeapYear(int year)
	{
		boolean is_leap_year = false;
		if (year % 4 == 0) {
			is_leap_year = true;
			if (year % 100 == 0) {
				if (year % 400 == 0)
					is_leap_year = true;
				else
					is_leap_year = false;
			}
		}
		else
			is_leap_year = false;

		if (!is_leap_year)
			System.out.println(year + " : Non Leap-year");
		else
			System.out.println(year + " : Leap-year");
	}

	// Driver Code
	public static void main(String[] args)
	{
		isLeapYear(2000);
		isLeapYear(2002);
	}
}
________________________________________________________________________________________________________________________________________________________
//2.Using Ternary Operator 


// Java program to find a leap year
 
// Importing Classes/Files
import java.io.*;
 
// Class for leap-year dealing
public class GeeksforGeeks {
 
    // Method to check leap year
    public static void isLeapYear(int year)
    {
        // flag to take a non-leap year by default
        boolean is_leap_year = false;
 
        is_leap_year = (year % 4 == 0 && year % 100 != 0
                        || year % 400 == 0)
                           ? true
                           : false;
        if (!is_leap_year)
            System.out.println(year + " : Non Leap-year");
        else
            System.out.println(year + " : Leap-year");
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        // Calling our function by
        // passing century year not divisible by 400
        isLeapYear(2000);
 
        // Calling our function by
        // passing Non-century year
        isLeapYear(2002);
    }
}



Using In-built isLeap() Method

Java has an in-built isLeap() method to check if the input year is a leap year or not.
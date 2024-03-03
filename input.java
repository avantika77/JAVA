no🔸int varName-----> Scanner se=new Scanner()------> varName =se.nextInt() -------->
 System.out.print(varName)
 Syntax of scanner class --------------------------------
[ variableofIntType=Scannerobject.nextInt();]
ScannerObject is the beforehand created object of the Scanner class
===============================================================================================
import java.io.*; 
import java.util.Scanner; //This line imports the Scanner class from the java.util package.
//The Scanner class is used to obtain user input from the console.
class Input
{
    public static void main(String[] args)//his is the entry point of the Java program.
 //It is a special method that JVM (Java Virtual Machine) looks for to start the execution of the program.
 //It takes an array of strings (args) as input parameters.
 {
     int num;
     System.out.println("Enter the number:");
     Scanner scanner=new Scanner(System.in);
     num = scanner.nextInt();
          System.out.println("Entered number:"+num);

}
}
===============================================
4 ways to take input in java ..
1.Standard Input/Output 
2.This is the Java classical method to take input, Introduced in JDK1.0. This method is used by wrapping the System.in (standard input stream) in an InputStreamReader which is wrapped in a BufferedReader, we can read input from the user in the command line. 
...The input is buffered for efficient reading.
... The wrapping code is hard to remember.

 =================================================================================================================================================
3.Using Scanner Class
This is probably the most preferred method to take input. The main purpose of the Scanner class is to parse primitive types and strings using regular expressions, however, it is also can be used to read input from the user in the command line. 
..Convenient methods for parsing primitives (nextInt(), nextFloat(), …) from the tokenized input.
..Regular expressions can be used to find tokens.
..The reading methods are not synchronized
 
// Java program to demonstrate working of Scanner in Java
import java.util.Scanner;
 class GetInputFromUser {
    public static void main(String args[])
    {
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);
 
        String s = in.nextLine();
        System.out.println("You entered string " + s);
 
        int a = in.nextInt();
        System.out.println("You entered integer " + a);
 
        float b = in.nextFloat();
        System.out.println("You entered float " + b);
    }
}




 
4. Using Console Class
..It has been becoming a preferred way for reading user’s input from the command line. In addition, it can be used for reading password-like input without echoing the characters entered by the user; the format string syntax can also be used (like System.out.printf()). 
 advantages:
 ..Reading password without echoing the entered characters.
 .. Reading methods are synchronized.
 .. Format string syntax can be used.
 .. Does not work in non-interactive environment (such as in an IDE).

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
==============================≠=================
Standard Input/Output 
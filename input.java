🔸int varName-----> Scanner se=new Scanner()------> varName =se.nextInt() -------->
 System.out.print(varName)
 Syntax of scanner class --------------------------------
[ variableofIntType=Scannerobject.nextInt();]
ScannerObject is the beforehand created object of the Scanner class
===============================================================================================
import java.io.*; 
import java.util.Scanner;
 
class Input
{
    public static void main(String[] args){
     int num;
     System.out.println("Enter the number:");
     Scanner scanner=new Scanner(System.in);
     num = scanner.nextInt();
          System.out.println("Entered number:"+num);

}
}


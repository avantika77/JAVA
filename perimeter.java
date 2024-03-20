//Perimeter of rectangle ABCD = 2A + 2B = 2(A+B)
import java.io.*;
 class perimeter {
    static void perimeter(int length, int breadth) //passing parameter
    {
        int perimeter = 2 * (length + breadth); //formula
        System.out.println("The perimeter of the rectangle lenght is "
            + length + " and breadth is " + breadth + " = "
            + perimeter);
    }
    // Driver method
    public static void main(String[] args)
    {
        int length = 10;
        int breadth = 20;
        perimeter(length, breadth); //calling parameter
    }
}
======================================================================================================================
The perimeter of the rectangle lenght is 10 and breadth is 20 = 60
======================================================================================================================
import java.util.Scanner;  //scanner 
class Perimeter {
    static void calculatePerimeter(int length, int breadth) {
        int perimeter = 2 * (length + breadth);
        System.out.println("The perimeter of the rectangle: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the rectangle: ");
        int length = scanner.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = scanner.nextInt();

        calculatePerimeter(length, breadth);

        scanner.close(); // Close the scanner to prevent resource leak
    }
}
========================================================================================================================
Enter the length of the rectangle: 67
Enter the breadth of the rectangle: 78
The perimeter of the rectangle: 290
 =======================================================================================================================

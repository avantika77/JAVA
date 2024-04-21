🔸An Armstrong number, also known as a narcissistic number or plenary number, is a special type of number in mathematics.
It's defined as an n-digit number that is equal to the sum of its own digits, each raised to the power of n.
🔸Armstrong number is a number that is equal to the sum of cubes of its digits.
  [  153 = (1*1*1)+(5*5*5)+(3*3*3)  
    where:  
    (1*1*1)=1  
    (5*5*5)=125  
    (3*3*3)=27  
    So:  
    1+125+27=153    ]
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int sum = 0;
        int temp = number;
        int digit;

        while (temp != 0) {
            digit = temp % 10;
            sum += Math.pow(digit, 3); // Cube each digit and add to sum
            temp /= 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}


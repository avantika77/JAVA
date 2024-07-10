import java.util.Scanner;

public class Binaryreverse {
    static String reverseBinary(int num) {
        String binaryString = Integer.toBinaryString(num); 
        String reversedBinaryString = new StringBuilder(binaryString).reverse().toString();
        return reversedBinaryString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        String reversedBinary = reverseBinary(num);
        System.out.println("Reversed binary: " + reversedBinary);

        scanner.close();
    }
}

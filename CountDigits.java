import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = scanner.nextLong();
        // Convert the number to a string
        String numberString = Long.toString(n);
        // Calculate the length of the string, which is the number of digits
        int count = numberString.length();
        System.out.println("Number of digits: " + count);
        scanner.close();
    }
}
// import java.util.Scanner;
// public class CountDigits {
//     public static void main(String[] args) {
//         long n;
//         int count = 0;
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter an integer: ");
//         n = scanner.nextLong();
//         while (n != 0) {
//             n /= 10;
//             ++count;
//         }
//         System.out.println("Number of digits: " + count);
//         scanner.close();
//     }
// }

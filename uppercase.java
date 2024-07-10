import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = scanner.next();
        scanner.close();

        char[] charArray = str.toCharArray(); // Convert string to character array

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'a' && charArray[i] <= 'z') {
                charArray[i] = (char) (charArray[i] - 'a' + 'A'); // Convert to uppercase
            }
        }

        // Convert character array back to string
        String uppercaseString = new String(charArray);

        System.out.println("Uppercase string is: " + uppercaseString);
    }
}

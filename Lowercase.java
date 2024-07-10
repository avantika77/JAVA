import java.util.Scanner;
public class Lowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word:");
        String str = scanner.next();
        scanner.close();

        char[] charArray = str.toCharArray(); // Convert string to character array

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] >= 'A' && charArray[i] <= 'Z') {
                charArray[i] = (char) (charArray[i] + 32); // Convert to lowercase
            }
        }

        // Convert character array back to string
        String lowercaseString = new String(charArray);

        System.out.println("Lowercase string is: " + lowercaseString);
    }
}



// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = scanner.nextLine();

//         // Using the built-in method to get the length of the string
//         int length = str.length();

//         System.out.println("Length of input string: " + length);
//     }
// }
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String str = scanner.nextLine();

        // Manually counting the length of the string
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            length++;

        }

        System.out.println("Length of input string: " + length);
    }
}
// =================================================================================================
// Enter a word: 
// supernatural
// Length of input string: 12
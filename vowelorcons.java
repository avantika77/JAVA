import java.io.*;        // imports the java.io package, which contains classes for input and output operations.
public class CHECK { 
    static void VoOrCont(char y) // static method named VoOrCont, which takes a single parameter of type char named y.
    //The method does not return any value (void). This method is used to check whether the given character is a vowel or a consonant.
    { 
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'                           //uppercase and lowercase
            || y == 'u'|| y == 'A' || y == 'E' || y == 'I'
            || y == 'O' || y == 'U') 
            System.out.println("It is a Vowel."); 
        else
            System.out.println("It is a Consonant."); 
    } 
    static public void main(String[] args) // the main method, which is the entry point of the program. 
    //It takes an array of String objects as its parameter.
    { 
        VoOrCont('b'); 
        VoOrCont('u'); 
        VoOrCont('W'); 
        VoOrCont('I'); 
    } 
}
__________________________________________________________________________________________________________________________________
It is a Consonant.
It is a Vowel.
It is a Consonant.
It is a Vowel.
===================================================================================================================================
import java.util.Scanner;
public class check{
    // Function to find whether an input character is a vowel or consonant
    static void VoOrCont(char y) {
        if (y == 'a' || y == 'e' || y == 'i' || y == 'o'
                || y == 'u' || y == 'A' || y == 'E' || y == 'I'
                || y == 'O' || y == 'U')
            System.out.println("It is a Vowel.");
        else
            System.out.println("It is a Consonant.");
    }
    // The Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);
        // Call the function to check whether the input character is a vowel or consonant
       VoOrCont(inputChar);
        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
==================================================================================================================================
Enter a character: t
It is a Consonant.
===================================================================================================================================
🔸 String indexOf() method returns the position of the first occurrence of the specified character or string in a specified string.
===================================================================================================================================
// java program to check whether input 
// character is a vowel or consonant 
import java.io.*; 
class check { 
	// Function to find whether an input 
	// character is vowel or not 
	static String isVowel(char ch) 
	{ 
		// Make the list of vowels 
		String str = "aeiouAEIOU"; 
		return (str.indexOf(ch) != -1) ? "Vowel": "Consonant"; 
	} 
    // Driver Code 
	public static void main(String[] args) 
	{ 
		System.out.println("It is a " + isVowel('a')); 
		System.out.println("It is a " + isVowel('x')); 
	} 
} 
===================================================================================================================================

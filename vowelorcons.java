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
_______________________________________
It is a Consonant.
It is a Vowel.
It is a Consonant.
It is a Vowel.
=======================================

// input from user
import Java util.scanner

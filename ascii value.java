import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = scanner.next().charAt(0); // first character
        int value = (int) ch; 
        System.out.println("The ASCII value of character " + ch + " is: " + value);
    
        scanner.close();
    }
}

//for whole word


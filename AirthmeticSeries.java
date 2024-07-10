import java.util.Scanner;

class ArithmeticSeries {
    static void printAS(int a, int d, int n) {
        int currentTerm = a;
        for (int i = 1; i <= n; i++) 
        {
            System.out.print(currentTerm + " ");
            currentTerm = currentTerm + d;
        }
    }
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the common difference: ");
        int d = scanner.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();
        printAS(a, d, n); //method call
        scanner.close();
    }
}

/*
Enter the starting number: 1
Enter the common difference: 3
Enter the number of terms: 10
1 4 7 10 13 16 19 22 25 28 
 */
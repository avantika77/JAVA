import java.util.Scanner;
public class TriangularSeq {
    public static boolean isTriangular(int num) {
        if (num < 0)
            return false;

        int sum = 0;
        for (int n = 1; sum <= num; n++) {
            sum += n;
            if (sum == num)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        boolean isTriangularSequence = true;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if (!isTriangular(a[i])) {
                isTriangularSequence = false;
                break;
            }
        }

        if (isTriangularSequence)
            System.out.println("Triangular sequence");
        else
            System.out.println("Not a triangular sequence");

        scanner.close();
    }
}

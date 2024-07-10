import java.util.Scanner;
public class ArrayAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        double[] array = new double[n]; // array of size n
        double sum = 0;
        System.out.println("Enter the elements: ");// elements of the array
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
            sum += array[i];  //  sum of elements
        }
        double average = sum / n;
        System.out.println("Average of the array elements: " + average);
        scanner.close();
    }
}

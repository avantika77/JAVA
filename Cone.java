import java.util.Scanner;

public class Cone {
    public static void findVolume(float radius, float height) {
        // The constant PI is available in the Math class
        double volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of cone: " + volume);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the radius of the base: ");
        float radius = scanner.nextFloat();
        
        System.out.print("Enter the height: ");
        float height = scanner.nextFloat();
        
        findVolume(radius, height);
        
        scanner.close();
    }
}

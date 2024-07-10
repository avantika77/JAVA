// Area of ellipse
import java.util.Scanner;
public class EllipseArea {
    public static void findArea(float a, float b) {
        float area = 3.142f * a * b;  
        System.out.println("Area: " + area);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter the semi-major : ");
        float a = scanner.nextFloat(); 
        System.out.print("Enter the semi-minor : ");
        float b = scanner.nextFloat(); 
        findArea(a, b);
        scanner.close();
    }
}
/* Enter the semi-major : 6
Enter the semi-minor : 6.9
Area: 130.0788
*/

//in c++ program
/* #include <iostream>
using namespace std;
void findArea(float a, float b) {
    float area = 3.142f * a * b;  
    cout << "Area: " << area << endl;
}
int main() {
    float a, b;
    cout << "Enter the semi-major: ";
    cin >> a;  
    cout << "Enter the semi-minor: ";
    cin >> b; 
    findArea(a, b);
    return 0;
}
*/

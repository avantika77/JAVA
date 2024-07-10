// Area of triangle
import java.util.Scanner;

public class TriangleArea {
    public static void findArea(float base, float height) {
        float area = (base * height) / 2;
        System.out.println("Area of triangle: " + area);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        float base = scanner.nextFloat();
        System.out.print("Enter the height: ");
        float height = scanner.nextFloat();
        findArea(base, height);
        scanner.close();
    }

}

/*
OUTPUT
Enter the base: 2
Enter the height: 4
Area of triangle: 4.0
 */






  

/* 
//IN C PROGRAM

int main()
{
float base,height,area;
printf("Enter base of triangle: ");
scanf("%f", &base);
printf("Enter height of triangle: ");
scanf("%f", &height);
area=(base+height)/2;
printf("Area of triangle: ",area);
return 0;
}
 

// WHEN 3 SIDES ARE GIVEN

#include<stdio.h>
#include<math.h>
int main()
{
double a, b, c, s, area;
printf("Enter the sides of triangle\n");
scanf("%lf%lf%lf", &a, &b, &c);
s = (a+b+c)/2;
//Heron's formula to compute the area of the triangle:
area = sqrt(s*(s-a)*(s-b)*(s-c));
printf("Area of the triangle = %.2lf\n", area);
return 0;
}

*/
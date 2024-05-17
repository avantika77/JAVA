//simple interset clculate interest charge on lone 
// formula  =>simple_interset =(principle x time x rate)/100
//Simple Interest = (P x T x R)/100 
import java.util.Scanner;
 class SimpleInterset{
    public static void main(String args[]){
    
    float p ,r,t;
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the value of principal : ");
     p = scanner.nextFloat();
    System.out.print("Enter the value of rate : ");
    r = scanner.nextFloat();
    System.out.print("Enter the value of time : ");
    t = scanner.nextFloat();
    float SI=(p*r*t)/100;
    System.out.println("Simple Interest: " +SI);
    scanner.close();
    }
}
=============================================================================================
🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸🔸
Enter the value of principal : 45  
Enter the value of rate : 3 
Enter the value of time : 7
Simple Interest: 9.45
=============================================================================================
// Compound Interest = P(1 + R/100)t
// Where,
// P is principal amount
// R is the rate and
// T is the time span 
import java.util.Scanner;
class CompoundInterest {
    public static void main(String args[]) {
        float p, r, t;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of principal: ");
        p = scanner.nextFloat();
        System.out.print("Enter the value of rate: ");
        r = scanner.nextFloat();
        System.out.print("Enter the value of time: ");
        t = scanner.nextFloat();
        
        double compound = p * (Math.pow(1 + r / 100, t));
        System.out.println("Compound Interest: " + compound);
        scanner.close();
    }
}
==========================================================================================
Enter the value of principal: 456
Enter the value of rate: 3
Enter the value of time: 7
Compound Interest: 560.822373588294
==========================================================================================

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

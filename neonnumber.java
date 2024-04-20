//neon number
// a neon number is a number wheree the sum, of digits of the square of the number is equal to the number .The task is to check and print neon numbers in a range 
//example : 9 => 9*9=81
//8+1=9
//9=9=>neon number
import java.io.*;
class neon {
    public static boolean checkneon (int n )
    {
        int square=n*n;
        int sum =0;
        while(square >0)
        {
            int r =square % 10;
            sum+=square;
            square =square/10;
        }

        if (sum==n)
        return true;
        else
        return false;
    }
    public static void main(String []args)
    {
        int n =9;
        if (checkneon(n))
        System.out.println("Give number"+n+"is neon number");
    }
}
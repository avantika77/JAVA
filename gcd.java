//program to find gcd and hcf of two number
//GCD: greatest commmon factor or hcf ( Highest Common Factor)is the largest number that can be divide both the given number
//60=2x2x3x5            [GCD:2x2x23=12]
//36=2x2x3x3
class check
{
    static int check(int x, int y) // arguments
    {
     if(x==0)
     return y;
     if(y==0)
     return x;
     if (x>y)
     return check (x-y,y);
     return check(x,y-x);
    }
    public static void main(String[] args)
    {
        int x= 100 ,y=90;
        System.out.println("GCD of " + x + " and " + y 
        + " is " + check(x, y));
    }
}

//An efficient solution is to utilize a modulo operator in the Euclidean algorithm which is the foremost algorithm applied for this topic.
class check{
    static int check(int x, int y)
    {
        if (y==0)
        return x;
        return check(y, x % y);
    }
    public static void main(String[] args)
    {
        int x= 45, y=77;
        System.out.println("The GCD of " + x + " and " + y 
        + " is: " + check(x, y));
    }
}

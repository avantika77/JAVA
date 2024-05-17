// demonstrate use of Clas Variable 
class program { 
    public static int ctr = 0; 
    public program() 
    { ctr++; } 
    public static void main(String[] args) 
    { 
        program obj1 = new program(); 
        program obj2 = new program(); 
        program obj3 = new program(); 
        System.out.println("Number of objects created are "+ program.ctr); 
    } 
}

public class factrecursion {
    public static void printFactorial(int n,int prod)
    {
        if(n==1)
        {
            prod=prod*n;
            System.out.println(prod);
            return;
        }
        prod=prod*n;
        printFactorial(n-1,prod);

    }
    public static void main(String args[])
    {
        printFactorial(5, 1);


    }
    
}

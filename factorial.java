import java.util.*; 
public class factorial {
    public static void printFactorial(int n)
    {
        if(n<0)
        {
            System.out.println("invalid");
            return ;
        }
        int fact=1;
        for(int i=n;i>=1;i--)
        {
            fact=fact*i;
           
        }
         System.out.print("factorial of number="+fact);
         return;
    }
        
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printFactorial(n);
    }
    
    
}

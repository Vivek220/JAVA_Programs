import java.util.*;
public class primefunction{
    public static void printPrime(int n)
    {
        int i=1; int count=0;
        while(i<=n)
        {
            if(n%i==0)
               count=count+1;
            i++; 
        }
        if(count==2)
        {
            System.out.println("prime");
            return ;
        }
        else{
            System.out.println("not prime");
            return;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        printPrime(n);

    }
}
    


import java.util.*;
public class addfunction {
    public static int sumOfAdd(int a,int b)
    {
        int sum=a+b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=sumOfAdd(a, b);//function call kiya
        System.out.println("sum of two numbers="+sum);//sum print krya

    }
    
}

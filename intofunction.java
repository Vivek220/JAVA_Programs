import java.util.*;
public class intofunction{
    public static int multiplyfun(int a,int b)
    {
        return a*b;//direct return krliya
    }
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println("product of two number="+multiplyfun(a,b));//print function me hi call kra liya
    }
}

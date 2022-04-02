public class fiborecursion {
    public static void fibonacciseries(int a,int b,int n)
    {
       if(n==0)
       {
           return;
       }
       int c=a+b;
       System.out.println(c);
       fibonacciseries(b, c, n-1);
    }
    public static void main(String args[])
    {
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        int n=7;
        fibonacciseries(a, b, n-2);//n-2 isliye becoz already hum 2 series printkra chuke hai  

    }
    
}

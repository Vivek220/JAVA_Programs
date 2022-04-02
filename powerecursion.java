public class powerecursion{
    public static int calPower(int x,int n)
    {
        if(n==0){//base case 1
            return 1;
        }
        if(x==0){//base case 2
            return 0;
        }
        int xpowernm1=calPower(x, n-1);
        int xpown=x*xpowernm1;
        return xpown;
    }
    public static void main(String args[])
    {
        int x=2,n=5;
        int ans=calPower(x, n);
        System.out.println(ans);

    }
    
}

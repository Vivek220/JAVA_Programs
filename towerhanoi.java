public class towerhanoi {
    public static void towerOfhanoi(int n,String src,String helper,String destination)
    {
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+destination);
            return;
        }
        towerOfhanoi(n-1, src, destination, helper);
        System.out.println("transfer disk"+n+"from"+src+"to"+destination);
        towerOfhanoi(n-1, helper,src, destination );
    }
    public static void main(String args[])
    {
        int n=3;
        towerOfhanoi(n, "S","H","D");
    }
}

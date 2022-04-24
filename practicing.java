public class practicing{
    public static void printNumber(int a,int b,int n){
        if(n==0){
            return;
        }
        int c=a+b;
        System.out.println(c);
        printNumber(b, c, n-1);
    //     if(n==1|| n==0){ 
    //         return 1;
    //     }
    //     int fact=printNumber(n-1);//hum ek hi line me bhi likh skte thhe!.........int fact=n*printNumber(n-1)
    //     int fact1=n*fact;
    //     return fact1;
        
    // public static void main(String args[]){
    //     int n=5;
    //     int ans=printNumber(n);
    //     System.out.println(ans);//factorial end
    }
    public static void main(String args[]){
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=8;
        printNumber(a, b, n-2);


    }

}
import java.util.*;
public class Binarysearch {
    int a[]=new int[50];
    int key,i,size;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the  size of array");
        size=sc.nextInt();
        for(i=0;i<size;i++)
        {
            System.out.println("enter the element of array");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the key which you want to search");
        key=sc.nextInt();

    }
    void print()
    {
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    void search()
    {
        int i,j,flag=0,mid,pos=0;
        i=0;
        j=size-1;
        while(i<=j&& flag==0)
        {
            mid=(i+j)/2;
            if(a[mid]==key)
            {
                flag=1;pos=mid+1;
            }
            if(a[mid]>key)
            {
                j=mid-1;
            }
            if(a[mid]<key)
            {
                i=mid+1;
            }
        }
        if(flag==1)
        {
            System.out.println("number found at="+pos);
        }
        else{
            System.out.println("number not found");
        }
    }
    public static void main(String args[])
    {
        Binarysearch aa=new Binarysearch();
        aa.input();
        aa.print();
        aa.search();

    }
    
}

import java.util.*;
public class insertionsort {
    int a[]=new int[50];
    int i,j,size;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of aaray");
        size=sc.nextInt();
        System.out.println("enter the element");
        for(i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void print()
    {
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    void sort()
    {
        int val=0;
        for(i=1;i<size;i++)
        {
            val=a[i];
            j=i-1;
            while(val<a[j])
            {
                a[j+1]=a[j];
                j--;
                if(j==-1)
                  break;
            }
            a[j+1]=val;
        }
    }
    public static void main(String args[])
    {
        insertionsort a=new insertionsort();
        a.input();
        System.out.print("unsorted array");
        a.print();
        a.sort();
        System.out.print("sorted array");
        a.print();

    }
    
}

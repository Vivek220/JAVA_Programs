import java.util.*;
public class selectionsort {
    int a[]=new int[50];
    int i,size;
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
       
    }
    void print()
    {
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    void sorting()
    {
        int t=0,i,j;
        for(i=0;i<size-1;i++)
        {
            for(j=i+1;j<size;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
    }
    void putdata()
    {
        for(i=0;i<size;i++)
        {
            System.out.println(a[i]+" ");
        }
    }
   public static void main(String args[])
   {
       selectionsort a=new selectionsort();
       a.input();
       System.out.println("unsorted array");
       a.print();
       a.sorting();
       System.out.println("sorted array");
       a.putdata();

   } 
}

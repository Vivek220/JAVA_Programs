import java.util.*;
public class linear
{
    int a[]=new int[50];
    int i,size,key;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        size=sc.nextInt();
        for(i=0;i<size;i++)
        {
            System.out.println("enter element");
            a[i]=sc.nextInt();
        }
        System.out.println("enter the element which you want to search");
        key=sc.nextInt();
    }
    void print()
    {
        System.out.println("array number");
        for(i=0;i<size;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    void search()
    {
        int flag=0,pos=0;
        for(i=0;i<size;i++)
        {
            if(a[i]==key)
            {
              flag=1;
              pos=i+1;
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
        linear aa=new linear();
        aa.input();
        aa.print();
        aa.search();
  
    }
    
}

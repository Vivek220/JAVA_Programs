import java.util.*;
/**
 * uservector
 */
public class uservector {

    public static void main(String args[])
    {
        Vector a=new Vector<>();
        Scanner sc=new Scanner(System.in);
        int count;
        System.out.println("enter number element in array");
        count=sc.nextInt();
        for(int i=0;i<count;i++)
        {
            System.out.println("Enter element for position " + (i + 1) + " : ");
            a.add(sc.next());
        }
        Iterator iterator = a.iterator();

        System.out.println("You have entered : ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

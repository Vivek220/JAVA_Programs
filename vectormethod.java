import java.util.*;
/**
 * vectormethod
 */
public class vectormethod {

    public static void main(String args[])
    {
        Vector a=new Vector();
        a.addElement("Lion");
        a.addElement("Tiger");
        a.addElement("Wolf");
        System.out.println("vectors element are:"+a);
        a.insertElementAt("cheetah", 2);
        System.out.println("element after inserting chhetah:"+a);
        System.out.println(a.size());
        a.removeElement("cheetah");
        System.out.println("elements after removing:"+a);
        a.removeElementAt(1);
        System.out.println(a);
        a.removeAllElements();
        System.out.println("after removing:"+a);
    }
}

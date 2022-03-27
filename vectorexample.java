import java.util.*;
/**
 * vectorexample
 */
public class vectorexample {
    public static void main(String args[])
    {
        Vector list=new Vector();
        list.addElement("Ram");
        list.addElement("sita");
        list.addElement("laxman");
        System.out.println(list);
        list.insertElementAt("hanuman", 2);
        System.out.println("vectors elements are:"+list);

    }
}
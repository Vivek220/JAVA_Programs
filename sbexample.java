import java.util.Scanner;
public class sbexample {
    public static void main(String args[])
    {
        StringBuffer str=new StringBuffer();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        //str=sc.nextLine();  we can not use this in case of stringbuffer
        str.append(sc.nextLine());
        str.setCharAt(3, 'u');
        System.out.println(str);
        str.insert(4,"java");
        System.out.println(str);
        str.setLength(20);
        System.out.println(str);
    }
    
}

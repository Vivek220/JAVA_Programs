import java.util.*;
public class shortname{
    public static void main(String args[])
    {
      String str=new String();
      int j;
      Scanner sc=new Scanner(System.in);
      str=sc.nextLine();
      int i=str.length()-1;
      while(str.charAt(i)!=' ')
      {
          i=i-1;
      }
      j=0;
      while(j<i)
      {
          if(j==0)
          {
              System.out.print(str.charAt(0)+".");
          }
          else{
              char c=str.charAt(j);
              char d=str.charAt(j+1);
              if(c==' '&&d!=' ')
                System.out.print(d+".");
          }
          j++;
      }
      System.out.print(str.substring(i));
    }
    
}

public class firstlastocurrence{
    public static int first=-1;
    public static int last=-1;
    public static void printOccurrence(String str,int indx,char element)
    {
        if(indx==str.length()-1)
        {
            System.out.println(first);
            System.out.println(last);
            return;
         
        }
        char currchar=str.charAt(indx);
        if(currchar==element){
            if(first==-1)
            {
                first=indx;
            }else{
                last=indx;
            }
        }
        printOccurrence(str, indx+1, element);
    }
    public static void main(String args[])
    {
        String str="abaacdacfaah";
        printOccurrence(str, 0, 'a');

    }
    
}

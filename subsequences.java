public class subsequences {
    public static void printsubsequences(String str,int indx,String newString){
        if(indx==str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(indx);
        //to be
        printsubsequences(str, indx+1, newString+currchar);
        //not to be
        printsubsequences(str, indx+1, newString);
    }
    public static void main(String args[])
    {
        String str="abc";
        printsubsequences(str, 0, "");

    }
    
}

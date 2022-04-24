public class duplicates {
    public static boolean[] map=new boolean[26];
    public static void removeduplicates(String str,int indx,String newstring){
        if(indx==str.length()){
            System.out.println(newstring);
            return;
        }
        char currchar=str.charAt(indx);
        if(map[currchar-'a']){
            removeduplicates(str, indx+1, newstring);
        }else{
            newstring+=currchar;
            map[currchar-'a']=true;
            removeduplicates(str, indx+1, newstring);
        }
    }
    public static void main(String args[])
    {
        String str="abbccda";
        removeduplicates(str, 0, "");

    }
    
}

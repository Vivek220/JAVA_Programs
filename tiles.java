public class tiles {
    public static int placeTiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int verplacements=placeTiles(n-m, m);
        int horiplacements=placeTiles(n-1, m);
        return verplacements+horiplacements;

    }
    public static void main(String args[]){
        int n=4,m=2;
        System.out.println(placeTiles(n, m));

    }
    
}

import java.util.*;
public class tiles{
    public static int printtiles(int n,int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        int verticalcount = printtiles(n-m, m);
        int horizontalcount = printtiles(n-1, m);
        return verticalcount+horizontalcount;
    }
public static void main(String[] args) {
    int n = 4,m = 2;
   System.out.println(printtiles(n,m));
}
}
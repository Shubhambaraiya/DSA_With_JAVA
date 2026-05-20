import java.util.*;
public class factorial {
    public static int printfabonacci(int n){
        if(n==0){
            return 1 ;
        }
        int c = n*printfabonacci(n-1);

return c;
    }
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
int ans  = printfabonacci(n);
System.out.println(ans);
   } 
}

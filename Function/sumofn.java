import java.util.*;
public class sumofn {
    public static void printsum(int n){
        int sum  = 0;
        for(int i = 1;i<=n;i++){
            sum = sum+i;
        }
        System.out.println(sum);
        return ;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printsum(n);
    }
}

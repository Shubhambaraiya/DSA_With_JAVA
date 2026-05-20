import java.util.*;
public class printthetable {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i<=n*10;i= i+n){
            System.out.println(i);
        }
    }
}

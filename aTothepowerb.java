import java.util.*;
public class aTothepowerb {
    public static int atob(int a,int b){
        if(b==0){
            return 1;
        }

        if(a==0){
            return 0;
        }

        int n = a*atob(a, b-1);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int result = atob(base,power);
        System.out.println(result);
    }
}

import java.util.*;
public class Toadd {
    public static int printSum(int a,int b){
        int c = a*b;
        return c;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
System.out.println(printSum(a, b));

    }
}

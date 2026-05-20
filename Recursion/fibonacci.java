import java.util.*;
public class fibonacci {
    public static void printfabonaccise(int a,int b,int n){
        if(n==0){
            return ;
        }
        int c = a+b;
System.out.println(c);
printfabonaccise(b, c, n-1);
    }
    public static void  main(String []args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    
    int n1 = 0;
    int n2 = 1;
    System.out.println(n1);
    System.out.println(n2);
    printfabonaccise(n1,n2,n-2);
}
}
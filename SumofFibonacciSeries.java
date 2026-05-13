import java.util.*;
public class SumofFibonacciSeries {
    public static void printSum(int a,int b,int sum,int n){
if(n==0){
    System.out.println();
    System.out.println(sum);
    return;
}
        int c = a+b;
        sum+=c;
        System.out.print(c+" ");
        printSum(b, c, sum,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a+" ");
        System.out.print(b+" ");

        printSum(a,b,a+b,n-2);
    }
}

import java.util.Scanner;

public class revision {
    public static int  printno(int a,int b) {
if(b==0){
    return 1;
}
if(a==0){
    return 0;
}
if(b%2==0){
    int cal = printno(a, b/2) * printno(a, b/2);
    return cal;

}
else{
    int cal = printno(a, b/2)*printno(a,b/2)*a;
    return cal;
}
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base:");
        int a = sc.nextInt();
        System.out.println("Enter the Power:");
        int b = sc.nextInt();
        System.out.println(a+" to the power "+b+"is :"+printno(a,b));

    }
}

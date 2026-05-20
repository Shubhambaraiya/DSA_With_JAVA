import java.util.*;
public class printfirstn {
    public static void printfn(int n2,int n){
    //     if(n==1){
    //         System.out.println(n);
    //         return ;
    //     }
    //     printfn(n-1);
    //     System.out.println(n);
    //     return ;
    // }
    if(n2==n+1){
        return ;
    }
    System.out.println(n2);
    printfn(n2+1, n);
    }
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n2 = 1;
        int n = input.nextInt();
        printfn(n2,n);

    }
}

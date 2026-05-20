import java.util.*;
public class basix {
    public static  void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n%2!=0){
            System.err.println("Weird");
        }
        if(n%2==0){
            if(n>=2 && n<=5){
                System.err.println("Not Weird");
            }
        }
        if(n%2==0){
            if(n>=6 && n<=20){
                System.err.println("Weird");
            }
        }
        if(n%2==0){
            if(n>20){
                System.err.println("Not Weird");
            }
        }
    }
}
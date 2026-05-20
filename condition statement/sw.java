import java.util.*;
public class sw {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n1 = 8;
        int n2 = 4;
        char op = sc.next().charAt(0);
        switch(op){
            case '+':
            System.out.println(n1+n2);
            break;
            case '-':
            System.out.println(n1-n2);
            break;
            case '*':
            System.out.println(n1*n2);
            break;
            case '/':
            System.out.println(n1/n2);
            break;

        }
    }
}

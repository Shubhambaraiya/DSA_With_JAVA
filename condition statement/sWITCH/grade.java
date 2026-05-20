import java.util.*;
public class grade {
    public static void main(String []args){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        switch(n){
            case 60:
    System.out.println("A");
    break; 
    case 45:
    System.out.println("b");
    break;
    case 33:
    System.out.println("c");
    break; 
    default:
    System.out.println("D");
    break;
        }
    }
} 

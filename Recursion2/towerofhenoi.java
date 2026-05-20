import java.util.*;
public class towerofhenoi {
    public static void printdisk(int n,String src,String help,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+" from "+src+" To "+dest);
            return;
        }
            printdisk(n-1, src, dest, help);
            System.out.println("Transfer disk "+n+" from "+src+" To "+dest);
        printdisk(n-1,help, src, dest);
        return;

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printdisk(n,"S","H","D"); 
    }
}

import java.util.*;
public class PalindromString {
    public static boolean ispalindrom(String str){
        int i = 0,j = str.length()-1;
        if(i<j){
            if(str.charAt(i++)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(ispalindrom(str));
    }
}
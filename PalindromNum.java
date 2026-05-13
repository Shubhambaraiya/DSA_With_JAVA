import java.util.*;
public class PalindromNum {
    public static void ispalindrom(int n){
        int reverse = n;
        int temp = 0;
        while (n!=0) {
            temp = temp *10 + n%10;
            n = n /10;
        }
        if (reverse==temp ){
            System.out.println("Given no. is palindrom");
        }
else{
    System.out.println("Not Palindrom");
}
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number  = sc.nextInt();
        ispalindrom(number);
    }
}

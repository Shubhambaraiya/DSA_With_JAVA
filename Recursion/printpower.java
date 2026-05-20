import java.util.*;

public class printpower {
    public static int printpw(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (a == 0) {
            return 0;
        }
        int pw = a * printpw(a, b - 1);
        return pw;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int power = sc.nextInt();
        int ans = printpw(base, power);
        System.out.println(ans);
    }
}

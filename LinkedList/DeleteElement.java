import java.util.LinkedList;
import java.util.*;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);

        for (int i = 1; i < n; i++) {
            if (i > 25) {
                list.remove(i);
            } else {
                list.add(i);
            }

        }
        System.out.println(list);

    }
}

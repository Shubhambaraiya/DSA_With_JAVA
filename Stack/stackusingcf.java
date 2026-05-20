import java.util.*;
public class stackusingcf{
    public static void main(String[] args) {
        Stack<Integer>stk = new Stack<>();
        stk.push(2);
        stk.push(4);
        stk.push(6);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        System.out.println(stk.peek());
        System.out.println(stk.size());
        System.out.println(max);
        while(stk.isEmpty()){
            System.out.println("Stack is Empty");
        }

    }
}

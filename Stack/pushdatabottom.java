import java.util.*;
public class pushdatabottom {
    public static void pushBottom(int data,Stack <Integer>sk){
        if(sk.isEmpty()){
            sk.push(data);
            return;
        }
        int top = sk.pop ();
        pushBottom(data, sk);
        sk.push(top);
    }
    public static void main(String []args){
Stack<Integer>sk = new Stack<>();
sk.push(1);
sk.push(2);
sk.push(3);

pushBottom(4,sk);
while(!sk.isEmpty()){
    System.out.println(sk.peek());
    sk.pop();
}    }
}

import java.util.*;
public class reversestack {
    public static void pushBottom(int data,Stack <Integer>sk){
        if(sk.isEmpty()){
            sk.push(data);
            return;
        }
        int top = sk.pop ();
        pushBottom(data, sk);
        sk.push(top);
    }
    public static void reverse(Stack <Integer>sk){
        if(sk.isEmpty()){
            return ;
        }
       int top =  sk.pop();
       reverse(sk);
       pushBottom(top, sk);
    }
    public static void main(String []args){
Stack<Integer>sk = new Stack<>();
sk.push(1);
sk.push(2);
sk.push(3);
reverse(sk);
while(!sk.isEmpty()){
    System.out.println(sk.peek());
    sk.pop();
}    }
}



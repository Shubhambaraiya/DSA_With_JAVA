import java.util.*;
public class stackarraylist {
    static class  stack{
static ArrayList<Integer>list = new ArrayList<>();
public static boolean isEmpty(){
    return list.size()==0;
}

public static void push(int data){
    list.add(data);
    return;
}

public static int pop(){
    if(isEmpty()){
        return -1;
    }
    int top = list.get(list.size()-1);
    list.remove(list.size()-1);
    return top;
}

public static int peep(){
    if(isEmpty()){
        return -1;
    }
    return list.get(list.size()-1);
}
    }

    public static void main(String []args){
stack stc = new stack();
stc.push(5);
stc.push(6);
stc.push(7);

while(!stc.isEmpty()){
    System.out.println(stc.peep());
    stc.pop();
}
    }
}

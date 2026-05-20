public class stackclass {
    static class Node{
        int data;
        Node next;

        public  Node(int data){
            this.data = data;
            next = null;
        }
    }
        static class stack{
public static Node head;
public static boolean isEmpty(){
    return head==null;
}
        public static void push(int data){
Node newNode = new Node( data);
            if(isEmpty()){
head = newNode;
return ;
            }
        newNode.next = head;
        head = newNode;
        }
        public static int pop(){
            if(head==null){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }}
    public static void main(String []args){
stack stc = new stack();
stc .push(5);
stc.push(6);
stc.push(7);

while (!stc.isEmpty()){
    System.out.println(stc.peek());
    stc.pop();
}
    }
}
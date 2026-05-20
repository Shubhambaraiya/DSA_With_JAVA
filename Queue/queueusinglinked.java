public class queueusinglinked {
     static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            next = null;
        }
    }
    static class Queue{
        static Node head = null;
        static Node tail = null;
        public static boolean isEmpty(){
        return head==null && tail==null;
            }
//  to add element in the queue
            public static void Toadd(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
             tail= head = newNode;
             return ;
        }
        tail.next = newNode;
        tail = newNode;
            }
            public static int Todelete(){
                if(isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                int front = head.data;
                if(head==tail){
                    tail=null;
                }
                head = head.next;
                return front;
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("Empty Queue");
                    return -1;
                }
                return head.data;
            }
        }
    public static void main(String []args){
        Queue q = new Queue();
            q.Toadd(1);
            q.Toadd(2);
            q.Toadd(3);
            q.Toadd(4);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.Todelete();
        }

    }
}

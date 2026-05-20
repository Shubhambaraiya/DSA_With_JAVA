public class cirxularqueue {
    static class Queue{
    static int arr[];
    static int size;
    static int rear = -1;
    static int front = -1;
Queue(int size){
        arr = new int[size];
        this.size = size;
    }

    public static boolean isEmpty(){
return rear==-1 || front ==-1;
    }

    public static boolean isFull(){
        return (rear+1)%size == front;
    }

    public static void Toadd(int data){
        if(isFull()){
            System.out.println("the queue is Fulll");
            return ;
        }
        if(front==-1){
            front = 0;
        }
        rear = (rear+1)%size;
        arr[rear] = data;
    }

    public static int remove(){
        if(isEmpty()){
        System.out.println("The queue is empty");
        return -1;
        }
        int result = arr[front];
        if(rear==front){
            rear = front = -1;
        }
        else{
            front = (front+1)%size;
        }
        return result;
    }
    public static int   peek(){
        if(isEmpty()){
            System.out.println("Empty Queue");
            return -1;
        }
        return arr[front];
    }
}
public static void main(String []args)
{
Queue q = new Queue(5);
q.Toadd(1);
q.Toadd(2);
q.Toadd(3);
q.Toadd(4);
q.Toadd(5);
// System.out.println(q.remove());
// System.out.println(q.remove());
q.Toadd(6);
q.Toadd(7);
while(!q.isEmpty()){
 System.out.println(q.peek());
 q.remove();
}}}
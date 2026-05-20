public class queueaarray {
    static  class Queuea{
        static int arr[];
        static int size;
        static int rear = -1;

        Queuea(int size){
            arr = new int[size];
            this.size = size;
        }

        public static boolean isEmpty(){
                return rear ==-1;
            }
            public static void add(int data){
                if(rear==size-1){
                    System.out.println("full");
                    return;
                }
                rear++;
                arr[rear] = data;
            }
            public static int remove(){
                if(isEmpty()){
                    System.out.println("queue is empty");
                    return -1;
                }
                int front = arr[0];
                for(int i = 0;i<rear;i++){
                    arr[i] = arr[i+1];
                }
                rear--;
                return front;
            }
            public static int peek(){
                if(isEmpty()){
                    System.out.println("the queue is empty");
                    return -1;
                }
                return arr[0];
            // }public static void printqueue(int data){
            //     if(isEmpty()){
            //         System.out.println("queue is empty");
            //         return;
            //     }
            //     int crr = arr[0];
            //     while(crr!=null){
            //         System.out.println(crr.data);
            // crr++;
            //     }
            //     arr[0]++;
            // }
        }}
    public static void main(String []args){
        Queuea q = new Queuea(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        // System.out.println(q.remove());
// System.out.println(q.remove());
q.add(5);
q.add(6);
q.add(7);

        // q.printqueue();
      while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
      }
    
}}

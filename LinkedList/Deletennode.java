public class Deletennode{
    ListNode head;
class ListNode{
    int data;
     ListNode next;

     ListNode(int data){
        this.data = data;
        this.next = null;
     }
}
// addfirst
public void addfirst(int data){
    ListNode newNode = new ListNode(data);
    if(head==null){
head = newNode;
return;
    }
    newNode.next = head;
    head = newNode;
}

// Add last
public void addlast(int data){
    ListNode newNode = new ListNode(data);
    if(head==null){
        head = newNode;
    }
    ListNode crrListNode = head;
    while(crrListNode.next!=null){
        crrListNode = crrListNode.next;
    }
    crrListNode.next = newNode;
}

public void printList(){
    if(head ==null){
        System.out.println("List is Empty");
    }
ListNode crrNode = head;
while(crrNode!=null){
    System.out.print(crrNode.data+"->");
    crrNode = crrNode.next;
}
System.out.println("null");
}

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null){
            return null;
        }
int size = 0;
ListNode crrNode = head;
while(crrNode!=null){
    crrNode = crrNode.next;
    size++;
}
if(n==size){
    return head.next;
}
int inxToSearch = size-n;
ListNode prevNode = head;
int i = 1;
while(i<inxToSearch){
prevNode = prevNode.next;
i++;
}
prevNode.next = prevNode.next.next;
return head;
    }
    public static void main(String []args){
    Deletennode list = new Deletennode();
    list.addfirst(4);
    list.addfirst(2);
    list.addfirst(1);
    // list.printList();
    // list.addlast(5);
    // list.addlast(6);
    // list.addlast(7);

    list.printList();
    list.head = list.removeNthFromEnd(list.head, 2);
    list.printList();
    }
}
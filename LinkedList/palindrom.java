public class palindrom{
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
            return head;
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
       
public ListNode reverse(ListNode head){
ListNode prevNode = null ;
ListNode crrNode = head;
while(crrNode!=null){
ListNode nextNode = crrNode.next;
crrNode.next = prevNode;
prevNode = crrNode;
crrNode = nextNode;
}
return prevNode;
    }
 public ListNode findmiddle(ListNode head){
        ListNode hare = head;
        ListNode turtle = head;
        while(hare.next!=null && hare.next.next!=null){
            hare = hare.next.next;
            turtle  = turtle.next;
        }
        return turtle;
    }
    public boolean Ispalindrom(ListNode head){
        if(head==null || head.next==null){
            return true;
        }

       ListNode middle = findmiddle(head);
       ListNode sechalfst = reverse(middle.next);

       ListNode firsthalfst = head;
       while(sechalfst!=null){
        if(firsthalfst.data!=sechalfst.data){
            return false;
        }
        firsthalfst = firsthalfst.next;
        sechalfst = sechalfst.next;
       }
       return true;
    }
public boolean hasCycle(ListNode head){
    if(head==null){
        return false;
    }
    ListNode hare = head;
    ListNode turtle = head;
    while(hare!=null && hare.next!=null){
hare = hare.next.next;
turtle = turtle.next;
if(hare==turtle){
    return true;
}
    }

    return false;
}
    public static void main(String []args){
    palindrom list = new palindrom();
    list.addfirst(1);
    list.addfirst(2);
    list.addfirst(4);
    // list.addlast(8);
    list.printList();
    list.head = list.removeNthFromEnd(list.head, 3);
    list.printList();
// list.head = list.reverse(list.head);
// list.printList();

// list.head = list.findmiddle(list.head);
// list.printList();

// list.Ispalindrom(list.head);

// list.hasCycle(list.head);

    }
}
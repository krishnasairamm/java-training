class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLinkedList {
   static Node head = null,temp=null;
    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            temp=head;
        }else{
            temp.next = newNode;
            temp = temp.next;
        }

    }
    public static void insertEnd(int data){
        Node newNode = new Node(data);
        temp.next = newNode;
        temp = temp.next;
    }
    
    public static void inserBegin(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }
    public static void delEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public static void delbegin(){
        head=head.next;
    }
    public static void reverse(){
        Node prev = null,current = head,next=null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void printList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        inserBegin(9);
        printList();
        delEnd();
        printList();
        delbegin();
        insertEnd(40);
        printList();
        reverse();
        printList();
        
    }
}
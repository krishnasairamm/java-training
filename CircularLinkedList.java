class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class CircularLinkedList {
    static Node head=null,temp=null;

    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            temp=head;
        }
        else{
            newNode.next=head;
            temp.next=newNode;
            temp = temp.next;
        }
    }
    public static void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            temp=head;
        }
        else{
            newNode.next=head;
            temp.next=newNode;
            temp = temp.next;
        }
    }
    public static void display(){
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        temp = head;
        do {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("head");
    }
    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        addAtEnd(100);
        display();
    }
}

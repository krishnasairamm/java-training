class Node{
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}
public class DoubleLinkedList {
    static Node head, temp=null;

    public static void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            temp=head;
        }
        else{
            temp.next = newNode;
            newNode.prev = temp;
            temp = temp.next;
        }
    }
    public static void display(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        add(50);
        display();
    }
}

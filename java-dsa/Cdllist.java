public class Cdllist {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;
            // by default null
            //this.next = null;
           // this.prev = null;
        }
    }
    private  Node head;
    
    public void insertAtBegin(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode.next = newNode.prev = newNode;
        }
        else{
            Node last=head.prev;

            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev=newNode;

            head = newNode;

        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode.next=newNode.prev=newNode;
            return;
        }
        else{
            Node last = head.prev;

            newNode.prev = last;
            newNode.next = head;

            last.next = newNode;
            head.prev = newNode;
        }
    }
    public void insertAtPos(int data, int pos) {

    if (pos < 0) {
        System.out.println("Invalid position.");
        return;
    }
    Node newNode = new Node(data);

    if (pos == 0) {
        if (head == null) {
            head = newNode.next = newNode.prev = newNode;
        } else {
            Node last = head.prev;
            newNode.next = head;
            newNode.prev = last;
            last.next = newNode;
            head.prev = newNode;
            head = newNode;
        }
        return;
    }
    Node current = head;
    for (int i = 0; i < pos - 1; i++) {
        current = current.next;
    }
    Node nextNode = current.next;

    newNode.next = nextNode;
    newNode.prev = current;
    current.next = newNode;
    nextNode.prev = newNode;
}

public void delAtBegin(){
    if(head==null){
        System.out.println("List is empty.");
        return;
    }
    if(head.next==head){
        head=null;
        System.out.println("Node deleted at begin");
        return;
    }
    Node newNode = head.next;
    Node last = head.prev;
    
    last.next = newNode;
    newNode.prev = last;
    head = newNode;
    System.out.println("Node deleted at begin");
    
}
public void delAtEnd(){
    if(head==null){
        System.out.println("List is empty.");
        return;
    }
    if(head.next==head){
        head=null;
        System.out.println("Node deleted. List is now empty.");
        return;
    }
    Node last = head.prev;
    Node newNode = last.prev;

    newNode.next=head;
    head.prev=newNode;
    System.out.println("Node deleted from the end.");
    
}
public void delAtPos(int pos) {
    if (head == null) {
        System.out.println("List is empty. Nothing to delete.");
        return;
    }

    if (pos == 0) {
        if (head.next == head) {
            head = null;
        } else {
            Node last = head.prev;
            head = head.next;
            last.next = head;
            head.prev = last;
        }
        System.out.println("Node deleted at position " + pos);
        return;
    }

    Node current = head;
    int count = 0;
    while (current.next != head && count < pos) {
        current = current.next;
        count++;
    }
    if (count != pos) {
        System.out.println("Invalid position or node not found.");
        return;
    }
    if (current.next == head) {
        Node previous = current.prev;
        previous.next = head;
        head.prev = previous;
        System.out.println("Node deleted at end.");
        return;
    }
    Node previous = current.prev;
    Node next = current.next;
    previous.next = next;
    next.prev = previous;
    System.out.println("Node deleted at position " + pos);
}
public boolean search(int key){
       if(head==null){
        System.out.println("List is empty");
        return false;
       }
       Node temp = head;
       do{
        if(temp.data==key){
            return true;
        }
        temp = temp.next;
       }while(temp!=head);
       return false;
    }

    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("Head");
    }

    public static void main(String[] args) {
        Cdllist cdl = new Cdllist();
        cdl.insertAtBegin(30);
        cdl.insertAtBegin(20);
        cdl.insertAtBegin(10);
        cdl.insertAtEnd(40);
        cdl.display();
        cdl.insertAtPos(15, 2);
        cdl.display();
        cdl.delAtBegin();
        cdl.display();
        cdl.delAtBegin();
        cdl.display();
        cdl.delAtEnd();
        cdl.display();
        cdl.delAtPos(1);
        cdl.display();
        cdl.insertAtBegin(30);
        cdl.insertAtBegin(20);
        cdl.insertAtBegin(10);
        cdl.insertAtEnd(40);
        cdl.display();
        System.out.println(cdl.search(20));

    }
}
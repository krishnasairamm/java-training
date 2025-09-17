public class CircularLinkedList {
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
    private Node head;
    private Node tail;

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
            newNode.next = head;
        }
        else{
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;

        }
        
    }
    public void insertAtPos(int data, int pos) {
        if (pos < 0) {
            System.out.println("Invalid position.");
            return;
        }
        Node newNode = new Node(data);

        if (pos == 0) {
            insertAtBegin(data);
            return;
        }

        Node current = head;
        int count = 0;
        
        while (current.next != head && count < pos - 1) {
            current = current.next;
            count++;
        }
        
        if (current.next == head && count < pos - 1) {
             System.out.println("Position out of bounds.");
             return;
        }

        newNode.next = current.next;
        current.next = newNode;
        
        if(newNode.next == head){
            tail = newNode;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        do {
        System.out.print(temp.data + " --> ");
        temp = temp.next;
    } while (temp != head);
        System.out.println("Head");
    }

    public void delAtBegin(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        tail.next = head.next;
        head = head.next;
    }
    public void delAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head==tail){
            head=null;
            tail=null;
            return;
        }
        Node temp =head;
        while (temp.next!=tail) {
            temp = temp.next;
        }
        temp.next=head;
        tail = temp;
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


    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBegin(10);
        cll.insertAtEnd(20);
        cll.insertAtPos(15, 1);
        cll.display(); 
        cll.insertAtPos(25, 3);
        cll.display(); 
        cll.insertAtPos(5, 0);
        cll.display(); 
        cll.insertAtPos(30, 10);
    }
}
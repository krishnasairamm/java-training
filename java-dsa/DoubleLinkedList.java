public class DoubleLinkedList {
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
   private Node head;
    public void insertAtBegin(int data){
        Node newNode = new Node(data);

        if(head==null){
            head = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    } 

    public void insertAtEnd(int data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
        }
        else{
            Node current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }
public void insertAtPos(int data, int pos) {
    Node newNode = new Node(data);
    if (pos == 0) {
       
        if (head == null) {
            head = newNode;
        } 
        
        else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        return; 
    }
    Node current = head;
    int currentPos = 0;
    while (current != null && currentPos < pos - 1) {
        current = current.next;
        currentPos++;
    }
    if (current == null) {
        System.out.println("Position out of bounds.");
        return;
    }
    if (current.next == null) {
        current.next = newNode;
        newNode.prev = current;
    } 
    else {
        newNode.next = current.next;
        current.next.prev = newNode;
        current.next = newNode;
        newNode.prev = current;
    }
}
    
    public void delAtBegin(){
        if(head==null){
            System.out.println("The list is Empty.");
            return;
        }
        head = head.next;
        if(head!=null){
            head.prev = null;
            System.out.println("Node deleted Successfully at begin");
        }
    }

    public void delAtEnd(){
        if(head==null){
            System.out.println("List empty");
            return;
        }

        if(head.next==null){
            head = null;
            System.out.println("Node Deleted.");
            return;

        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.prev.next = null;
        System.out.println("Node Deleted..");
    }

    public boolean search(int key){
        Node current = head;
        while (current!=null) {
            if(current.data==key){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.insertAtBegin(10);
        dl.display();
        dl.insertAtEnd(20);
        dl.display();
        dl.insertAtEnd(30);
        dl.display();
        int searchkey1 = 30;
        if(dl.search(searchkey1)){
            System.out.println("Element " + searchkey1 + " is found in the list");
        }
        else{
            System.out.println("Element " + searchkey1 + " is not found in the list");
        }
        dl.delAtBegin();
        dl.display();
        dl.insertAtBegin(40);
        dl.insertAtBegin(50);
        dl.display();
        dl.delAtEnd();
        dl.display();
        dl.insertAtPos(10,1);
        dl.display();
        
    }
}
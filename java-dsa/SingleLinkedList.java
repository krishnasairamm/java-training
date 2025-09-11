//import java.util.LinkedList;
public class SingleLinkedList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
        }
    }
    private Node head;
    public void insertAtBegin(int data){
        Node newnNode = new Node(data);
        newnNode.next = this.head;
        this.head = newnNode;
    }
    public void inserAtEnd(int data){
        Node newNode = new Node(data);
        if(this.head==null){
            this.head = newNode;
        }
        else{
            Node temp = this.head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next = newNode;
        }
    }
    public void printList(){
        Node current = this.head;
        System.out.println("Linked List : ");
        while(current!=null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        System.out.println("\nInsert at beginning:");
        list.insertAtBegin(5);
        list.printList();
        list.insertAtBegin(4);
        list.insertAtBegin(3);
        list.insertAtBegin(2);
        list.insertAtBegin(1);
        list.printList();
        System.out.println("\n");

        System.out.println("Insert At end:");
        list.inserAtEnd(10);
        list.inserAtEnd(20);
        list.inserAtEnd(30);
        list.printList();
    }
}

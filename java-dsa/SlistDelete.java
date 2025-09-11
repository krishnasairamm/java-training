public class SlistDelete {
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node head;

public void insert(int data){
    Node newNode = new Node(data);
    if(head==null){
        head = newNode;
    }
    else{
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
}

public void delAtBegin(){
        if(head==null){
            System.out.println("List is empty. Can't delete");
            return;
        }
        head = head.next;
        System.out.println("Node deleted Successfully at begin");   
    }
public void delAtEnd(){
    if(head==null){
            System.out.println("List is empty. Cant delete");
            return;
     }
     
     if(head.next==null){
        head = null;
        System.out.println("Node deleted. List is now empty.");
        return;
     }
     
     Node current = head;
     while(current.next.next!=null){
        current=current.next;
     }
     current.next=null;
     System.out.println("Node Deleted at end.");
    
}

public void printList(){
    Node current = head;
    System.out.println("Linked List: ");
    while(current!=null){
        System.out.print(current.data+" --> ");
        current = current.next;
    }
    System.out.println("null");

}
public static void main(String[] args) {
    SlistDelete list = new SlistDelete();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.insert(50);
    list.insert(60);
    list.printList();
    list.delAtBegin();
    list.printList();
    list.delAtEnd();
    list.printList();
}
}

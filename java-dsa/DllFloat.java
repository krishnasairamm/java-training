public class DllFloat {
    class Node{
        double data;
        Node next;
        Node prev;

     Node(double data){
        this.data = data;
        this.next=null;
        this.next=null;
     }
    }
     private Node head;
    public void insertAtBegin(double data){
        
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
    public void insertAtEnd(double data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
            current.prev=current;
        }
    }

    public boolean search(double key){

        Node current = head;
        while(current!=null){
            if(current.data==key){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void printList(){
        Node current = head;
        while (current!=null) {
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DllFloat dl = new DllFloat();
        dl.insertAtBegin(1.1);
        dl.printList();
        dl.insertAtEnd(2.1);
        dl.insertAtEnd(3.1);
        dl.insertAtBegin(4.1);
        dl.printList();
        double searchkey1 = 3.1;
        if(dl.search(searchkey1)){
            System.out.println("Element " + searchkey1 + " is found in the list");
        }
        else{
            System.out.println("Element " + searchkey1 + " is not found in the list");
        }
    
    }
}

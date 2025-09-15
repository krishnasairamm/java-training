public class DllString {
    class Node{
        String data;
        Node next;
        Node prev;
        Node(String data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    private Node head;
    public void insert(String data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = newNode;
        newNode.prev=current;
    }

    public void delAtBegin(){
        if(head==null){
            System.out.println("List is empty.");
            return;
        }
        head = head.next;
        if(head!=null){
            head.prev=null;
            System.out.println("Node deleted at begin..");
        }
    }

    public void delAtEnd(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.next==null){
            head = null;
            System.out.println("Node deleted at end.");
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.prev.next=null;
        System.out.println("Node deleted at end..");
    }

    public void display(){
        Node current = head;
        while(current!=null){
            System.out.print(current.data+" --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DllString dl = new DllString();
        dl.insert("A");
        dl.display();
        dl.insert("B");
        dl.insert("C");
        dl.insert("D");
        dl.display();
        dl.delAtBegin();
        dl.display();
        dl.delAtEnd();
        dl.display();
    }
}

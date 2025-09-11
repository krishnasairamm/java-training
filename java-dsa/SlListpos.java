class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
}
 class LinkedList{
        Node head;
        public void insertAtpos(int data, int pos){
            Node newNode = new Node(data);
            if(pos==0){
                newNode.next = head;
                head = newNode;
            }
            else{
                Node current = head;
                for(int i=0;i<pos-1 && current.next!=null;i++){
                    current = current.next;
                }
                if(current.next==null&&pos-1!=0){
                    System.out.println("Position out of bounds");
                    return;
                }
                newNode.next = current.next;
                current.next=newNode;
            }
        }
        public void printList(){
                Node current = head;
                while(current!=null){
                    System.out.print(current.data+" ");
                    current = current.next;
                }
        System.out.println();
        }
}
public class SlListpos {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        System.out.println("Original List:");
        list.printList();
        list.insertAtpos(25,2);
        System.out.println("List after Intersection:");
        list.printList();

    }
}
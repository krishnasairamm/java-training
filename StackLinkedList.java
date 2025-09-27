class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class StackLinkedList {
   static Node head=null;

    public void push(int data){

        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            head.next=null;
        }
        else{
            newNode.next = head;
            head=newNode;
        }
        System.out.println("Pushed: "+data);
    }

    public void pop(){
        System.out.println("Popped: "+head.data);
        head=head.next;
    }

    public void peek(){
        System.out.println("Peek: "+head.data);
    }
    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+" -->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.peek();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.display();
         stack.pop();
         stack.display();
    }
}

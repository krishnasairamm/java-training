class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SingleLLatPos {
    static Node head , temp=null, prev=null;

    public static void add(int data){
       
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            temp = head;
        }
        else{
            temp.next = newNode;
            temp = temp.next;
        }
    }

    public static void insertatPos(int pos,int data){
        Node newNode = new Node(data);
        prev = head;
        int i = 1;
        while(pos-1>i){
            prev=prev.next;
            i++;
        }
        newNode.next = prev.next;
        prev.next = newNode;

    }

    public static void delPos(int pos){
        Node prev1 = null;
        prev = head;
        int i = 1;
        while(pos>i){
            prev1 = prev;
            prev=prev.next;
            i++;
        }
        prev1.next = prev.next;
    }

    public static void reverse(){
        Node prev = head;
        Node prev1 = null, prev2=null;
        while(prev!=null){
            prev1 = prev;
            prev=prev.next;
            prev1.next=prev2;
            prev2 = prev1;
        }
        head = prev2;
    }

    public static void display(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -->");
            temp = temp.next;
            count++;
        }
        System.out.println("null");
        System.out.println("No.of Nodes : "+count);
    }

    public static void main(String[] args) {
        add(10);
        add(20);
        add(30);
        add(40);
        display();
        reverse();
        display();
    }
}

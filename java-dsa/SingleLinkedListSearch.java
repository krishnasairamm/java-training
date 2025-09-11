class SingleLinkedListSearch{
    class Node{
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        this.next = null;
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
public boolean search(int key){
    Node current=head;
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
    System.out.println("Linked List: ");
    while(current!=null){
        System.out.print(current.data+" --> ");
        current = current.next;
    }
    System.out.println("null");
}

public static void main(String[] args) {
    SingleLinkedListSearch list = new SingleLinkedListSearch();
    list.insert(10);
    list.insert(20);
    list.insert(30);
    list.insert(40);
    list.printList();

    int searchkey1 = 30;
    if(list.search(searchkey1)){
        System.out.println("Element " + searchkey1 + " is found in the list");
    }
    else{
        System.out.println("Element " + searchkey1 + " is not found in the list");
    }

}
}

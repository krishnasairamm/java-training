import java.util.LinkedList;
import java.util.Queue;
public class SimpleQueue {
    //simple queue
    public static void main(String[] args) {
        Queue<String> Queue = new LinkedList<>();
        Queue.add("A"); //insert 
        Queue.add("B");
        Queue.add("C");
        Queue.add("D");
        
        String headElement = Queue.peek(); //peek element
        System.out.println("All elements : "+Queue);
        System.out.println("No of elements : "+Queue.size());  //size
        System.out.println("Peek Element : "+headElement);
        Queue.remove();                         //delete 
        System.out.println("Delete Element :"+Queue);
        Queue.remove();
        System.out.println("Delete Element :"+Queue);
        Queue.remove();
        System.out.println("Delete Element :"+Queue);
        Queue.remove();
        System.out.println("Delete Element :"+Queue); 
        System.out.println("Is Queue Empty? : "+(Queue.isEmpty()?"Yes" : "No"));    //empty check
    }
}

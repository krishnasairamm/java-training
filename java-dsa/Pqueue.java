import java.util.PriorityQueue;
import java.util.Queue;
public class Pqueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(10);
        
        System.out.println("Priority Queue elements are : "+pq);

        int hpel = pq.remove();
        System.out.println("First priority element : "+hpel);
        System.out.println("Elements are : "+pq);
        int peekel = pq.peek();
        System.out.println("Peek Element : "+peekel);
        int shpel = pq.remove();
        System.out.println("Second priority element : "+shpel);
        System.out.println("Elements are : "+pq);
        System.out.println(pq.remove());
    }
}

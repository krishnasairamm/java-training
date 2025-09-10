import java.util.ArrayDeque;
import java.util.Deque;
public class Dequeue {
    public static void main(String[] args) {
        Deque<Integer> De = new ArrayDeque<>();
        De.addFirst(1);
        De.addFirst(2);
        De.addLast(3);
        System.out.println("Elements are : "+De);
        int f = De.removeFirst();
        int l = De.removeLast();
        System.out.println("First removed element : "+f);
        System.out.println("Last removed element : "+l);


    }
}

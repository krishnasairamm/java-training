import java.util.ArrayDeque;
import java.util.Deque;
public class DequeueExample {
    public static void main(String[] args) {
        Deque<String> de = new ArrayDeque<>();
        de.add("Engineering");
        de.addFirst("Chalapathi");
        de.addLast("College");
        de.add("Lam");
        de.add("Guntur");
        System.out.println(de);
        System.out.println(de.reversed());
       // System.out.println(de.removeFirst() +" "+de.remove()+" "+de.removeLast());
        for(int i=0;i<5;i++){
            System.out.print(de.removeLast()+" ");
        }
        
    }
}

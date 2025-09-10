import java.util.ArrayDeque;
import java.util.Deque;
public class StackExample2 {
    public static void main(String[] args) {
        Deque<Integer> stack1 = new ArrayDeque<Integer>();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push(40);
        System.out.println("Stack after Insertion "+ stack1);
        stack1.pop();
        System.out.println("Stack after deletion "+ stack1);
        stack1.pop();
        System.out.println("Stack after deletion "+ stack1);
        stack1.pop();
        System.out.println("Stack after deletion "+ stack1);
        stack1.pop();
        System.out.println("Stack after deletion "+ stack1);  
    }
}

import java.util.*;
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(); // create stack
        stack.push("one");  //stack push 
        stack.push("two");
        stack.push("three");
        stack.push("four");
       //t System.out.println(stack);
       
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());  // stack pop
        }

        System.out.println();

        Stack<Integer> stack2 = new Stack<>();
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        
         while (!stack2.isEmpty()) {
            System.out.println(stack2.pop());
        }
    } 
}
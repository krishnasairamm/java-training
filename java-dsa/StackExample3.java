import java.util.*;
public class StackExample3 {
    
    static void stackPush(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        System.out.println(stack);
    }
    static void stackPop(Stack<Integer> stack){
        System.out.println("Stack Operation");
        for(int i=0;i<5;i++){
           int y =  (Integer) stack.pop();
           System.out.println(y);
        }
    }
    static void stackPeek(Stack<Integer> stack){
        System.out.println("Stack Peek");
           int x = (Integer) stack.peek();
           System.out.println(x);

    }
    static void stackSearch(Stack<Integer> stack, int el){
        
        int pos = (Integer) stack.search(el);
        if(pos==-1){
            System.out.println("Element not found");
        }
        else{
         System.out.println("Element is found at : "+pos);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPop(stack);
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack,2);
        stackSearch(stack, 6);
    }
}

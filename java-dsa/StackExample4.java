import java.util.Stack;

public class StackExample4 {
    static  String reverse(String s){
       Stack<Character> stack1 = new Stack<>();  
       for(char c : s.toCharArray()){
        stack1.push(c);
       }
       StringBuilder res = new StringBuilder();
       while(!stack1.isEmpty()){
        res.append(stack1.pop());
       }
       return res.toString();
    
}
    public static void main(String[] args) {
       String s = "ABC";
       System.out.println(s);
       System.out.println(reverse(s));
    }
}

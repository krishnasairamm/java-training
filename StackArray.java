public class StackArray {
    int[] arr;
    int size;
    int top;

    public StackArray(int size){
        arr = new int[size];
        top=-1;
        this.size=size;
    }
    public void push(int data){
        if(isFull()){
            System.out.println("Stack overFlow");
            return;
        }
        top++;
        arr[top]=data;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return;
        }
        System.out.println("Popped: "+arr[top]);
        top--;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return top;
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==size-1;
    }
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.peek();
    }
}

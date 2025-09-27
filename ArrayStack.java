/* public class ArrayStack {
     int[] stackArray;
     int top; 
     int capacity; 

    public ArrayStack(int capacity) {
        this.capacity = capacity;
        stackArray = new int[capacity];
        top = -1; 
    }

    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element: " + item);
            return;
        }
        top++;
        stackArray[top] = item;
        System.out.println("Pushed: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1; 
        }
        int poppedItem = stackArray[top];
        top--;
        System.out.println("Popped: " + poppedItem);
        return poppedItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No element to peek.");
            return -1; 
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }


    public boolean isFull() {
        return top == capacity - 1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        stack.pop();
        stack.pop();

        stack.push(40);
        stack.push(50);
        stack.push(60); 

        System.out.println("Is stack empty? " + stack.isEmpty());
        System.out.println("Stack size: " + stack.size());
    }
} */
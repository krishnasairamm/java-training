//import java.util.*;
public class CircularQueue {
   int[] queue;
   int front;
   int rear;
   int size;
   int capacity;

   public CircularQueue(int capacity){
        this.capacity = capacity;
        queue = new int[capacity];
        front = -1;
        rear = -1;
        size =0;
   }
   public boolean isEmpty(){
    return size==0;
   }
   public boolean isFull(){
    return size==capacity;
   }
   public void enqueue(int item){
    if(isFull()){
        System.out.println("Queue is full Cannot enqueue"+item);
        return;
    }
    rear = (rear+1)%capacity;
    queue[rear] = item;
    size++;
    if(front==-1){
        front=0;
    }
    System.out.println("Enqueued : " + item);
   }

   public int dequeue(){
    if(isEmpty()){
        System.out.println("Queue is empty. Cannot dequeued");
        return -1;
    }
    int item = queue[front];
    front = (front+1)%capacity;
    size--;
    if(size==0){
        front = -1;
        rear = -1;
    }
    System.out.println("Dequeued : "+item);
    return item;
   }

   public int peek(){
    if(isEmpty()){
        System.out.println("Queue is empty. No element to peek");
        return -1;
    }
    return queue[front];
   }

   public void display(){
    if(isEmpty()){
        System.out.println("queue is empty");
        return;
    }
    System.out.println("Circular queue: ");
    int count =0;
    int i=front;
    while(count<size){
        System.out.println(queue[i]+" ");
        i=(i+1)%capacity;
        count++;
    }
    System.out.println();
   }
   public static void main(String[] args) {
    CircularQueue cq = new CircularQueue(5);
    cq.enqueue(10);
    cq.enqueue(20);
    cq.enqueue(30);
    cq.enqueue(40);
    cq.enqueue(50);
    System.out.println("Peek element : "+cq.peek());
    cq.display();
    cq.dequeue();
    System.out.println(cq.isEmpty());
    System.out.println(cq.isFull());
   }
}

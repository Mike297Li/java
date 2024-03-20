package main.java.com.example.demo;
import java.util.Stack;
public class MyQueue {
    private Stack stack1;
    private Stack stack2;

    public MyQueue(){
        stack1=new Stack();
        stack2=new Stack();
    }

    public Integer dequeue(){
        // only this situation need to do such movement
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return (Integer) stack2.pop();
    }

    public void enqueue(Integer val){
        stack1.push(val);
    }

    public Integer peek(){
        while (!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        return (Integer) stack2.peek();
    }

    public Boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public int size(){
        return stack1.size()+stack2.size();
    }


    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue());  // Output: 1
        System.out.println("Peek: " + queue.peek());  // Output: 2
        System.out.println("Size: " + queue.size());  // Output: 2

        queue.enqueue(4);
        System.out.println("Dequeue: " + queue.dequeue());  // Output: 2
        System.out.println("Is Empty: " + queue.isEmpty());  // Output: false
        System.out.println("Size: " + queue.size());  // Output: 2
    }

}

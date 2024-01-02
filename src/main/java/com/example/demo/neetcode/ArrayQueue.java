package main.java.com.example.demo.neetcode;


public class ArrayQueue<E> implements Queue<E>{

    private Array<E> array;


    public ArrayQueue(int capacity){
          array=new Array<>(capacity);
    }
    public ArrayQueue(){
        this(10);
    }
    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.add(array.getSize(),e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.removeFirst();
    }

    @Override
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for(int i=0;i<array.getSize();i++){
           sb.append(array.getElement(i));
            if(i!=array.getSize()-1){
                sb.append(",");
            }else {
                sb.append("]");
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        ArrayQueue queue=new ArrayQueue();
        for(int i=0;i<=5;i++){
            queue.enqueue(i);
        }
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        queue.enqueue(8);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
    }
}

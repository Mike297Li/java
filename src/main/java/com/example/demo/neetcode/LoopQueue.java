package main.java.com.example.demo.neetcode;

public class LoopQueue<E> implements Queue<E>{
    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity){
        data= (E[]) new Object[capacity+1];
        front=0;
        tail=0;
        size=0;
    }
    public LoopQueue(){
        this(10);
    }

    public int getCapacity() {
        return data.length-1;
    }


    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    @Override
    public void enqueue(E e) {
      if((tail+1)%data.length==front)
          reSize(getCapacity()*2);
      data[tail]=e;
      tail=(tail+1)%data.length;
      size++;

    }

    private void reSize(int newCapacity) {
        E[] newData= (E[]) new Object[newCapacity+1];
        for(int i=0;i<size;i++){
            newData[i]=data[(front+i)%data.length];
        }
        data=newData;
        front=0;
        tail=size;

    }

    @Override
    public E dequeue() {
        if(isEmpty())
            throw new IllegalArgumentException("queue is empty");
        E ret=data[front];
        front=(front+1)%data.length;
        size--;
        if(size<=getCapacity()/4 && getCapacity()/2!=0)
            reSize(getCapacity()/2);
        return ret;
    }

    @Override
    public E getFront() {
        if(isEmpty())
            throw new IllegalArgumentException("queue is empty");
        return data[front];
    }

}

package main.java.com.example.demo.neetcode;

import java.util.Random;

public class TestArrayVSLoopQueue {
    public static void main(String[] args) {

        System.out.println("ArrayQueue:"+testQueue(new ArrayQueue<>(),100000));
        System.out.println("LoopQueue:"+testQueue(new LoopQueue<>(),100000));

    }

    public static double testQueue(Queue<Integer> q,int count){
        long start=System.nanoTime();
        Random random=new Random();
        for(int i=0;i<count;i++)
            q.enqueue(random.nextInt(Integer.MAX_VALUE));
        for(int i=0;i<count;i++)
            q.dequeue();
        long end=System.nanoTime();
        return (end-start)/10000000;
    }

}

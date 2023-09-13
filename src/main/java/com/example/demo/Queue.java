package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    // fist in first out
    List<Integer> list=new ArrayList<Integer>();

    public int push(Integer newElement){
        list.add(newElement);
        return newElement;
    }

    public Integer pop(){
        if(list.size()>0){
            Integer first = list.get(0);
            list.remove(0);
            return first;
        }else {
            System.out.println("====空集合======");
            return null;
        }

    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        int pop = queue.pop();

        System.out.println("=========="+pop);
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();




    }

}

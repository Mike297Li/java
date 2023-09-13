package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;


public class Stack {

    // Last in first out
    // operation：push/pop/isEmpty/front
    List<Integer> list=new ArrayList<Integer>();

    public Integer push(Integer newComer){
        list.add(newComer);
        return newComer;
    }

    public Integer pop(){
        Integer pop =null;
        if(list.size()>0){
            int i = list.size() - 1;
             pop = list.get(i);
            list.remove(i);
        }else {
            System.out.println("========空栈无法操作==");
            return null;
        }
        return pop;
    }

    public static void main(String[] args) {

        Stack stack=new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        Integer pop = stack.pop();

        System.out.println("=========="+pop);

        Integer pop2 = stack.pop();
        System.out.println("========2=="+pop2);
        Integer pop3 = stack.pop();
        System.out.println("========3=="+pop3);
        Integer pop4 = stack.pop();
        System.out.println("========4=="+pop4);


    }

}

package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab10174 {
    public static void main(String[] args) {
        int[] array=new int[20];
        List<Integer> listEven=new ArrayList<Integer>();
        List<Integer> listOdd=new ArrayList<Integer>();

        for(int i=0;i<array.length;i++){
            Scanner scanner=new Scanner(System.in);
            System.out.println("Please input a number");
            array[i]=scanner.nextInt();
        }
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                listEven.add(array[i]);
            }
            if(array[i]%2==1){
                listOdd.add(array[i]);
            }
        }
        Object[] arrayEven=listEven.toArray();
        Object[] arrayOdd=listOdd.toArray();
        for(int i=0;i<arrayEven.length;i++){
            System.out.println("arrayEven==="+arrayEven[i]);
        }
        for(int i=0;i<arrayOdd.length;i++){
            System.out.println("arrayOdd==="+arrayOdd[i]);
        }
    }

}

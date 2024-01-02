package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class assignment5ForWeek102 {
    public static void main(String[] args) {
        int size=5;
        int[] array=new int[size];
        Random rand = new Random();
        List<Integer> evenNumbers=new ArrayList<>();
        List<Integer> oddNumbers=new ArrayList<>();
        for(int i=0;i<size;i++){
            // Obtain a number between [0 - 21].
            int nextInt = rand.nextInt(22);
            array[i]= nextInt;
            if(nextInt%2==0){
               evenNumbers.add(nextInt);
            }else {
                oddNumbers.add(nextInt);
            }
        }
        Integer evenSum = even(evenNumbers);
        Integer oddSum = odd(oddNumbers);
        int result=evenSum>oddSum ? oddSum: evenSum;
        System.out.println("the factorial of "+result +" is "+factorial(result));
    }

    /**
     * Compute the factorial
     * @param oddSum
     * @return
     */
    private static long factorial(Integer oddSum) {
        System.out.println("====="+oddSum);
        long factorial=1;
        while (oddSum>0){
            factorial=factorial*oddSum;
            oddSum--;
        }
        return factorial;
    }

    /**
     * generate sum of even numbers
     * @param list
     * @return
     */
    private static Integer even(List<Integer> list) {
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

    /**
     * generate sum of odd numbers
     * @param list
     * @return
     */
    private static Integer odd(List<Integer> list) {
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        return sum;
    }

}

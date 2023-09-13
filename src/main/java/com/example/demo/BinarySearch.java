package main.java.com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinarySearch {

    public static void main(String[] args) {
         System.out.println(getIndex(3));
    }

    private static int  getIndex( int a) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = IntStream.of(array).boxed().collect(Collectors.toList());
        int low=0;
        int high=array.length-1;
        int mid=(array.length-1)/2;
        while (low<=high){
            if(a-list.get(mid)==0){
                return mid;
            }
            if(a>mid){
                low=mid+1;
            }
            if(a<mid){
                high=mid-1;
            }
            mid=(low+high)/2;
        }
        return -1;
    }
}

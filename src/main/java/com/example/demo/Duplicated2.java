package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicated2 {

    /*Input: nums = [1,2,3,1]
    Output: true*/
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(extracted(array));

    }

    private static Boolean extracted(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.add(nums[i])){
                return true;
            }
        }
        return false;
    }
}

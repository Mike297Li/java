package main.java.com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicated {

    /*Input: nums = [1,2,3,1]
    Output: true*/
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1};
        System.out.println(extracted(array));

    }

    private static Boolean extracted(int[] nums) {
        ArrayList list = new ArrayList();
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        set.addAll(IntStream.of(nums).boxed().collect(Collectors.toList()));
        if (nums.length != set.size()) {
            return true;
        }
        return false;
    }
}

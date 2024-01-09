package main.java.com.example.demo.neetcode;

import java.util.*;

public class IntersectionOfTwoArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                  if(nums1[i]==nums2[j]){
                      set.add(nums1[i]);
                  }
            }
        }
       return set.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        Set<Integer> set=new TreeSet<>();

        for(int i=0;i<nums1.length;i++){
           set.add(nums1[i]);
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums2.length;j++){
           if(set.contains(nums2[j])){
               list.add(nums2[j]);
               set.remove(nums2[j]);
           }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // Each element in the result must appear as many times as it shows in both arrays
//    Input: nums1 = [1,2,2,1], nums2 = [2,2]
//    Output: [2,2]
//    Example 2:
//
//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [4,9]
    public static int[] intersection3(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map=new TreeMap();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
           if(map.containsKey(nums1[i])){
               map.put(nums1[i],map.get(nums1[i])+1);
           }else {
               map.put(nums1[i],1);
           }
        }
        for(int j=0;j<nums2.length;j++){
            if(map.containsKey(nums2[j])){
                list.add(nums2[j]);
                map.put(nums2[j],map.get(nums2[j])-1);
                if(map.get(nums2[j])==0){
                    map.remove(nums2[j]);
                }
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
//    Given a 2D integer array nums where nums[i] is a non-empty array of distinct positive integers,
//    return the list of integers that are present in each array of nums sorted in ascending order.
    public static List<Integer> intersection(int[][] nums) {
        List<Integer> ans = new ArrayList<>();
        int[] count  = new int[1001];
        for(int[] arr : nums){
            for(int i : arr){
                count[i]++;
            }
        }
        for(int i=0;i<count.length;i++){
            if(count[i]==nums.length){
                ans.add(i);
            }
        }

        return ans;
    }


    public static void main(String[] args) {
//        int[] nums1={4,9,5};
//        int[] nums2={9,4,9,8,4};
//        int[] ints = intersection3(nums1, nums2);
        int[][] arr={{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> intersection = intersection(arr);
        System.out.println(intersection);
    }
}

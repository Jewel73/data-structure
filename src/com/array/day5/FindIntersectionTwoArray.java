package com.array.day5;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionTwoArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> result = new HashSet<Integer>();
        Arrays.sort(nums2);
        for(int num: nums1){
            boolean found = findTarget(nums2, num);
            if(found ){
                result.add(num);
            }
        }

        return convertSetToArray(result);
    }

    public static int[] convertSetToArray(Set<Integer> sets){
        Integer[] integerArray = sets.toArray(new Integer[0]);
        int[] output = new int[integerArray.length];

        for (int i = 0; i < integerArray.length; i++){
            output[i] = integerArray[i];
        }

        return  output;
    }

    public static boolean findTarget(int[] nums, int target){

        int start = 0, end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target) return true;
            if(target > nums[mid]) start++;
            if(target < nums[mid]) end--;
        }

        return false;
    }
}

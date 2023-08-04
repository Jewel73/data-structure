package com.array.day6;

import java.util.Arrays;

public class FindSingleElement {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,3,4,4,8,8};
    }
    public static int singleNonDuplicate(int[] nums) {

        int start = 0;
        int end = nums.length - 1;

        if(end == 0) return nums[end];
        if(nums[end] != nums[end-1]) return nums[end];
        if(nums[start] != nums[start+1]) return nums[start];

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == nums[mid+1]){
                boolean isEven = mid%2 == 0;
                if(isEven){
                    start = mid +2;
                }else{
                    end = mid - 1;
                }
            }else if(nums[mid] == nums[mid-1]){
                boolean isEven = (mid-1) %2 == 0;
                if(isEven){
                    start = mid +1;
                }else{
                    end = mid - 2;
                }
            }else{
                return nums[mid];
            }
        }

        return -1;


    }
}

package com.array.day7;

public class FindMinInRoatedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,8,1,2,3};
        findMinNumber(nums);
    }

    public static int findMinNumber(int[] nums){

        int start = 0;
        int end = nums.length-1;


        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid] > nums[mid+1]) return nums[mid+1];
            if(mid> start && nums[mid] < nums[mid-1]) return nums[mid];

            if(nums[start] >= nums[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return nums[0];
    }
}

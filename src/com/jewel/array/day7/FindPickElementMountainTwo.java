package com.jewel.array.day7;

public class FindPickElementMountainTwo {

    public static void main(String[] args) {
        int[] nums = {1,2,1,3,4,5,6,7};
        System.out.println(findPick(nums));
    }

    public static int findPick(int[] nums){

        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[mid+1]){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
    }
}

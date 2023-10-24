package com.jewel.array.day7;

public class FindTargetInRotedArray {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int pivot = pivotIndex(nums);


        int val1 = Binarysearch(nums, target, 0, pivot);
        int val2 = Binarysearch(nums, target, pivot+1, nums.length-1);

        if(val1 != -1) return val1;
        else return val2;

    }

    public static int Binarysearch(int[] nums, int target, int s, int e) {

        int start = s;
        int end = e;

        while(start <= end){

            int mid = start + (end - start)/2;


            if(nums[mid] == target) return mid;
            if(nums[mid]>target){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return -1;
    }

    public static int pivotIndex(int[] nums){

        int start = 0;
        int end = nums.length-1;


        while(start <= end){
            int mid = start + (end - start)/2;
            if(mid<end && nums[mid] > nums[mid+1]) return mid;
            if(mid> start && nums[mid] < nums[mid-1]) return mid-1;

            if(nums[start] >= nums[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
}

package com.jewel.array.day7;

public class FindTargetInRotatedDuplicateElements {
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        search(nums, 0);
    }
    public static boolean search(int[] nums, int target) {

        int pivot = pivotIndex(nums);
        boolean val1 = Binarysearch(nums, target, 0, pivot);
        boolean val2 = Binarysearch(nums, target, pivot+1, nums.length-1);

        if(val1) return val1;
        else return val2;
    }

    public static boolean Binarysearch(int[] nums, int target, int s, int e) {

        int start = s;
        int end = e;

        while(start <= end){

            int mid = start + (end - start)/2;


            if(nums[mid] == target) return true;
            if(nums[mid]>=target){
                end = mid-1;
            }else{
                start = mid+1;
            }

        }

        return false;
    }
    public static int pivotIndex(int[] nums){

        int start = 0;
        int end = nums.length-1;


        while(start <= end){
            int mid = start + (end - start)/2;

            if(mid<end && nums[mid] > nums[mid+1]) return mid;
            else if(mid> start && nums[mid] < nums[mid-1]) return mid-1;


            if(start<end && nums[start] == nums[start+1]) start++;
            else if(end>start && nums[end-1] == nums[end]) end--;
            else if(nums[start] > nums[mid]) {
                end = mid-1;
            }else{
                start = mid+1;
            }
        }

        return -1;
    }
}

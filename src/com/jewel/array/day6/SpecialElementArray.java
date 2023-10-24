package com.jewel.array.day6;

public class SpecialElementArray {
    public static void main(String[] args) {
        int[] nums = {3,5};
        specialArray(nums);
    }
    public static  int specialArray(int[] nums) {

        int len = nums.length;
        int start = 0;


        while(start <= len){

            int mid = start + (len - start)/2;
            int count = 0;

            for(int num: nums){
                if(num >= mid ) count++;
            }

            if(count == mid) return mid;
            else if(count > mid){
                start = mid +1;
            }else{
                len = mid - 1;
            }
        }

        return -1;

    }

}

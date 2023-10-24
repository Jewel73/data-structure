// leetcode problem: https://leetcode.com/problems/split-array-largest-sum/

package com.jewel.array.day3;

public class SplitArrayLargestOptimalSum {

    public static void main(String[] args) {
        int arr[] = {7,2,5,10,9};
        int k = 2;
        int answer = splitArray(arr, k);
        System.out.println(answer);
    }
    public static int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int mid = 0;

        for(int num: nums){
            low = Math.max(low, num);
            high += num;
        }

        while(low < high){
            mid = low + (high - low)/2;
            boolean val = possibleToSplitK(nums, mid, k);

            if (val) high = mid;
            else  low = mid+1;
        }
        return low;
    }

    private static boolean possibleToSplitK(int[] nums, int mid, int k) {
        int subarray = 1;
        int sum = 0;
        for(int num: nums){
            sum += num;
            if(sum > mid){
                subarray++;
                sum = num;
            }
        }
        return subarray <= k;
    }

}

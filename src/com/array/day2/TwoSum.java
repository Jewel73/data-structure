// Leetcode problem: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/d

package com.array.day2;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9 ;

        System.out.println(Arrays.toString(indexOfSum(numbers, target)));
    }


    public static int[] indexOfSum(int[] numbers, int target){

        int start = 0;
        int end = numbers.length - 1;
        int[] output = new int[2];

        while(start <= end){

            int sumTwo = numbers[start] + numbers[end];

            if(sumTwo > target){
                end = end-1;
            } else if (sumTwo < target) {
                start = start + 1;
            }else {
                output[0] = start;
                output[1] = end;

                return output;
            }

        }

        return output;

    }
}

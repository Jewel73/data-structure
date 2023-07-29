// leetcode problem: 1539. Kth Missing Positive Number

package com.array.day4;

public class FindKthPositive {

    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        System.out.println(findKthPositive(arr, 5));
    }
    public static int findKthPositive(int[] arr, int k) {

        int missing = 0;
        int checkMissing = 1;

        for(int i = 0; i< arr.length ; checkMissing++){

            if (checkMissing == arr[i]) {
                i++;
            }else{
                missing++;
            }

            if(missing == k) return checkMissing;

        }

        return checkMissing + k - missing - 1;
    }
}

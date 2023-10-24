// leetcode problem: 1539. Kth Missing Positive Number

package com.jewel.array.day4;

public class FindKthPositive {

    public static void main(String[] args) {
        int[] arr = {2};
        System.out.println(findKthPositive(arr, 1));
    }
    public static int findKthPositive(int[] arr, int k) {
       int start = 0;
       int end = arr.length-1;

       while(start <= end){
           int mid = start + (end - start)/2;

           if(arr[mid] - (mid+1) >= k){
               end = mid - 1;

           }else {
               start = mid +1;
           }
       }

       return start + k;
    }
}

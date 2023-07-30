package com.array.day5;

public class CheckNdoubleExist {

    public boolean checkIfExist(int[] arr) {

        int left = 0;
        int right = 0;
        int end = arr.length;
        while(end < end){

            if(right == end) return false;

            if(left != right && arr[left] == 2 * arr[right]){
                return true;
            }

            if(right == end-1){
                left++;
                right = 0;
            }else{
                right++;
            }
        }

        return false;

    }
}

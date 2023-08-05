package com.array.day8;

import java.util.Arrays;

public class FindIntervalRightBinarySearch {

    public static void main(String[] args) {
        int[][] arr = {{3,4},{2,3},{1,2}};
        findRightInterval(arr);
    }

    public static int[] findRightInterval(int[][] intervals) {

        int len = intervals.length;
        int[][] sortArrWithIndex = new int[len][2];
        for (int i=0; i<len; i++){
            sortArrWithIndex[i][0] = intervals[i][0];
            sortArrWithIndex[i][1] = i;
        }

        Arrays.sort(sortArrWithIndex, (a, b) -> a[0] - b[0]);
        int[] ans = new int[len];
        for (int i=0; i<len; i++){

            int target = intervals[i][1];
            int start = 0;
            int end = len-1;

            while(start<= end){
                int mid = start + (end-start)/2;

                if(sortArrWithIndex[mid][0] >= target) end=mid-1;
                else if(sortArrWithIndex[mid][0] < target) start = mid+1;
            }

            if(start<len) ans[i] = sortArrWithIndex[start][1];
            else ans[i] = -1;
        }

        return ans;

    }
}

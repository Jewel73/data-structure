package com.array.day8;

public class RightIntervalBruteForce {

    public static void main(String[] args) {
        int[][] arr = {{3,4},{2,3},{1,2}};
        int[] val = findRightInterval(arr);
    }
    public static int[] findRightInterval(int[][] intervals) {

        int[] ans = new int[intervals.length];

        for(int i=0; i< intervals.length; i++){

            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for(int j =0; j < intervals.length; j++){

                if(intervals[j][0] >= intervals[i][1] && intervals[j][0] < min){
                    min = intervals[j][0];
                    minIndex = j;
                }
            }

            ans[i] = minIndex;

        }

        return ans;

    }
}

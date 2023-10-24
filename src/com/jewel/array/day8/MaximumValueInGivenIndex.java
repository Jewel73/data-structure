/*
* https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
* */

package com.jewel.array.day8;

public class MaximumValueInGivenIndex {

    public static void main(String[] args) {
        long n = 3, index = 0,  maxSum = 815094800 ;

        System.out.println(maxValue(n, index, maxSum));
    }
    public static int maxValue(long n, long index, long maxSum) {

        long r = n - index - 1;
        long l = index;
        long high = maxSum;
        long res = 0;
        long low = 1;

        while(low <= high){

            long mid = low + (high-low)/2;

            long sum = mid;
            long rs = 0;
            long ls = 0;
            long m = mid-1;

            if(r <= m){
                rs = m * (m+1) /2 - (m-r) * (m-r+1)/2;
            }else {
                rs = m*(m+1)/2 + 1*(r-m);
            }

            if(l <= m){
                ls = m*(m+1)/2 - (m-l)*(m-l+1)/2;
            }else {
                ls = m*(m+1)/2 + 1* (l-m);
            }

            sum += ls + rs;

            if(sum <= maxSum){
                low = mid +1;
                res = mid;
            }else {
                high = mid-1;
            }

        }

        return (int) res;


    }
}

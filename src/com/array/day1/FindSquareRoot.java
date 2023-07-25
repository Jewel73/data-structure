// leetcode problem: https://leetcode.com/problems/sqrtx/description/

package com.array.day1;

public class FindSquareRoot {
    public static void main(String[] args) {

        var val = findSquareRoot(25);
        System.out.println(val);

    }


    static int findSquareRoot(int num){
        double low = 0;
        double high = num;
        double tollarence = 1e-1;

        while(high - low > tollarence){

            double mid = low + (high - low)/2 ;
            double squreValue = mid * mid;

            if(squreValue > num){
                high = mid;
            }else {
                low = mid;
            }

        }

        return (int)high;
    }


}

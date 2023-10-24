// leetcode problem:https://leetcode.com/problems/valid-perfect-square/

package com.jewel.array.day2;

public class FindValidPerfectSqure {

    public static void main(String[] args) {
        System.out.println(isNumberPerfectSquare(16));
    }

    static boolean isNumberPerfectSquare(int num){

        long low  = 0;
        long high = num;
        long mid = 0;

        while((high - low) > 0 ){
            mid = low + (high - low)/2;
            long midSquare = mid*mid;

            if(midSquare == num) return true;
            if(midSquare > num){
                high = mid;
            }else{
                low = mid;
            }
        }

        return mid == num;


    }
}

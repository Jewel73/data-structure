//leetcode problem: https://leetcode.com/problems/arranging-coins/


package com.array.day4;

public class ArrangeCoins {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }

    public static int arrangeCoins(int n) {


        int start=1, end = n, res =0;

        while(start <= end){

            int mid = start + ( end - start)/2;
            double value = ((double) mid / 2) * (mid+1);
            int checkValue = (int) value;

            if(checkValue <= n){
                start = mid+1;
                res = mid;

            }else{
                end = mid-1;
            }
        }

        return res;


    }
}

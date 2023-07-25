//https://leetcode.com/problems/first-bad-version/submissions/

package com.jewel.day1;

import java.util.Random;

public class FindBadVersion {

    public static void main(String[] args) {
        var version = badVersion(10);
    }

    static int badVersion(int n){
        int first = 0 ;
        int last = n ;

        int mid = 0;
        int currentBadV = -1;

        while(first <= last){
            mid = first + (last -first )/2;
            boolean isBad = isBadVersion(mid);
            if(isBad){
                currentBadV = mid;
                last = mid-1;
            }else{
                first = mid+1;
            }
        }

        return currentBadV;
    }

    private static boolean isBadVersion(int mid) {
        // TODO : implment method
        return true;
    }
}

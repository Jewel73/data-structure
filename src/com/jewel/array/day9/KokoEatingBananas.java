// https://leetcode.com/problems/koko-eating-bananas/description/
package com.jewel.array.day9;

public class KokoEatingBananas {

    public static void main(String[] args) {
        int[] arr = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        System.out.println(minEatingSpeed(arr, 823855818));
    }
    public static int minEatingSpeed(int[] piles, int h) {

        int start = 1;
        int end = -1;
        int res = 0;

        for(int p: piles){
            end = Integer.max(end, p);
        }

        while(start <= end){

            int mid = start + (end - start)/2;
            int sumHours = checkHours(piles, mid);
            if(sumHours > h){
                start = mid+1;
            }else if (sumHours <= h){
                end = mid-1;
                res = mid;
            }
        }

        return res;
    }

    private static int checkHours(int[] piles, double mid) {
        int sum = 0;
        for (int p: piles){
            double div = (double) (p / mid);
            sum += Math.ceil(div);
        }

        return sum;
    }
}

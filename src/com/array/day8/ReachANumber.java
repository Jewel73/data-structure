//https://leetcode.com/problems/reach-a-number/description/
package com.array.day8;

public class ReachANumber {

    public static void main(String[] args) {
        System.out.println(reachNumber(4));
    }
    public static int reachNumber(int target) {

        target = target * -1;
        int check = 1;
        int step = 1;

        while(true){

            if(check == target) return  step;
            if(target < check && (check - target)%2==0 ){
                return step;
            }
            else{
                    step++;
                    check = check + step;

            };

        }
    }

}

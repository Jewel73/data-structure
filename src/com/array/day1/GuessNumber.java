//https://leetcode.com/problems/guess-number-higher-or-lower/

package com.array.day1;

public class GuessNumber {
    public static void main(String[] args) {
        var val = pickedNumber(20);
    }


    static int pickedNumber(int num){
        int start = 1;
        int end = num;
        int mid = 0;

        while(start <= end){
            mid = start + ( end - start) / 2;
            int guessOutput = guess(mid);

            if(guessOutput == 0){
                return mid;
            }else if(guessOutput == 1){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return mid;


    }

    private static int guess(int guess) {
        int picked = 10;
        if(guess < picked ){
            return 1;
        } else if (guess > picked) {
            return -1;
        }
        return 0;
    }
}

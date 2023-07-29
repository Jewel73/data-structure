// leetcode problem: https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package com.array.day4;

public class FindTargetNexChar {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'g';

        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {

        int start = 0, end = letters.length-1;

        if(target >= letters[letters.length-1]){
            return letters[0];
        }

        while(start <= end){
            int mid = start + ( end - start)/2;

            if(target >= letters[mid]){
                start = mid + 1;
            }else{
                end = mid-1;
            }
        }

        return letters[start];
    }
}

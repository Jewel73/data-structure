package com.jewel.array.day5;

import java.util.Arrays;
import java.util.HashSet;

public class FairCandy {

    public static void main(String[] args) {
        int[] arrA = {1, 2, 5};
        int[] arrB = {2,4};

        System.out.println(Arrays.toString(fairCandySwap(arrA, arrB)));
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int sumA = 0, sumB = 0; int diff = 0;
        int[] output = new int[2];
        HashSet<Integer> setB = new HashSet<>();

        for(int size : aliceSizes) {
            sumA+= size;
        }

        for(int size: bobSizes){
            sumB+= size;
            setB.add(size);
        }

        diff = (sumB - sumA)/2;

        for(int size : aliceSizes){
            if(setB.contains(size+diff)){
                output[0] = size;
                output[1] = size+diff;

                return output;
            }
        }

        return output;
    }
}

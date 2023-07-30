package com.array.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionUsingPointer {

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int m = nums1.length, n = nums2.length;
        int i = 0, j = 0;
        ArrayList<Integer> result = new ArrayList<>();

        while(i < m && j < n){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] > nums2[j]) j++;
            else if(nums1[i] < nums2[j]) i++;
        }
        return convertSetToArray(result);
    }

    public static int[] convertSetToArray(ArrayList sets){
        int[] output = new int[sets.size()];

        for (int i = 0; i < sets.size(); i++){
            output[i] = (int) sets.get(i);
        }

        return  output;
    }
}

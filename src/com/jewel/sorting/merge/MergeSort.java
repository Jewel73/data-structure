package com.jewel.sorting.merge;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        /*
        int arr1[] = {2,3,6,8,10};
        int arr2[] = {1,4,7};
        int[] sorted = mergeTwoArray(arr1, arr2);
        System.out.println(Arrays.toString(sorted));
        */
        int arr1[] = {3,1,5,4};
        int[] sorted = sort(arr1);
        System.out.println(Arrays.toString(sorted));
    }


    public static int[] sort(int arr[]){

        if(arr.length == 1) return  arr;
        int mid = arr.length/2;

        int left[] = sort(Arrays.copyOfRange(arr, 0, mid));
        int right[] = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return mergeTwoSortedArray(left, right);
    }

    public static int[] mergeTwoSortedArray(int[] arr1, int[] arr2){
        int[] mergeArr = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i<arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergeArr[index]= arr1[i];
                i++;
            }else {
                mergeArr[index] = arr2[j];
                j++;
            }
            index++;
        }

        while (i < arr1.length){
            mergeArr[index] = arr1[i];
            i++;
            index++;
        }

        while (j<arr2.length){
            mergeArr[index] = arr2[j];
            j++;
            index++;
        }

        return mergeArr;
    }
}

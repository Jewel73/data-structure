package com.jewel.sorting.quick;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {4,2,3,7,1,5};
        sort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[], int pivot , int end){

        int pivot1 = pivot(arr, pivot, end);
        if(pivot < end){
            sort(arr, 0, pivot1-1);
            sort(arr, pivot1+1, end);
        }

    }

    public static int pivot(int arr[], int pivot, int end){
        int swap = pivot;
        for(int i=1+pivot; i<= end; i++){
            if(arr[pivot]> arr[i]){
                swap++;
                swapValue(arr, swap, i);
            }
        }

        swapValue(arr, swap, pivot);
        return swap;

    }

    public static void swapValue(int arr[], int swap, int i){
        int temp = arr[swap];
        arr[swap] = arr[i];
        arr[i] = temp;
    }


}

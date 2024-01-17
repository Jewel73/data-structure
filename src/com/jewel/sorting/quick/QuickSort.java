package com.jewel.sorting.quick;

import java.util.Arrays;

public class QuickSort {


    public static void main(String[] args) {
        int arr[] = {4,2,3,7,1,5};
        sort(arr, 0, 5);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[], int start, int end){

        int pivotIndex = pivot(arr, start, end);
        if(start<end){
            sort(arr, start, pivotIndex-1);
            sort(arr, pivotIndex+1, end);
        }
    }

    public static int pivot(int arr[], int start, int end){
        int pivot = start;
        int swapIndex = start;

        for (int i=pivot+1; i<=end; i++){
            if(arr[pivot] > arr[i]){
                swapIndex++;
                swap(arr, swapIndex, i);
            }

        }
        swap(arr, pivot, swapIndex);
        return swapIndex;
    }

    public static void swap(int arr[], int swap, int i){
        int temp = arr[i];
        arr[i] = arr[swap];
        arr[swap] = temp;
    }
}

package com.jewel.sorting.insertion;

import com.jewel.sorting.selection.SelectionSort;

public class InsertionSort {

    public void sort(int[] arr){

        for (int i=1; i<arr.length; i++){

            int temp = arr[i];
            int j = i-1;

            while(j>-1 && temp < arr[j]){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3,2,6,7,1};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        for(int a : arr){
            System.out.print(" "+ a);
        }
    }
}

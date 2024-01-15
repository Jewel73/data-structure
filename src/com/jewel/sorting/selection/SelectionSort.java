package com.jewel.sorting.selection;

public class SelectionSort {

    public void sort(int[] arr){

        for (int i=0; i< arr.length; i++){
            int minIndex = i;
            for (int j=i; j<arr.length; j++){

                if(arr[i]> arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3,2,6,7,1};
        SelectionSort insertionSort = new SelectionSort();
        insertionSort.sort(arr);
        for(int a : arr){
            System.out.print(" "+ a);
        }
    }
}

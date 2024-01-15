package com.jewel.sorting.bubble;

public class BubbleSort {
    // 4,1,2,6,3 =>
    public void sort(int[] arr){
        for (int i= arr.length-1; i>0; i--){
            for (int j=0; j<i; j++){
                if(arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 3,2,6,7,1};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        for(int a : arr){
            System.out.print(" "+ a);
        }
    }
}

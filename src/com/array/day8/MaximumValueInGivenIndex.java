package com.array.day8;

public class MaximumValueInGivenIndex {

    public static void main(String[] args) {
        int n = 6, index = 1,  maxSum = 10 ;

        System.out.println(maxValue(n, index, maxSum));
    }
    public static int maxValue(int n, int index, int maxSum) {

        int [] ans = new int[n];

        int start = 0;
        int end = maxSum;

        while(start <= end){

            int mid = start + (end -start)/2;

            ans[index] = mid;
            ans = insertValueInArray(index+1, n, mid, index, ans);
            ans = insertValueInArray(0, index, mid, index, ans);

            int sum = sumArr(ans);

            if(sum > maxSum){
                end = mid-1;
            } else if (sum < maxSum) {
                start = mid+1;
            }else {
                return ans[index];
            }
        }

        return ans[index];

    }

    public  static  int sumArr(int[] arr){
        int sum = 0;
        for(int n : arr) {
            sum += n;
        }

        return sum;
    }
    public static int[] insertValueInArray(int fromIndex, int toIndex, int fromValue,int maxIndex, int[] arr){
        int val = arr[maxIndex];
        for (int i=fromIndex; i<toIndex; i++){
            val--;
            if(val<1) arr[i] = 1;
            else arr[i] = val;
        }
        return arr;
    }
}

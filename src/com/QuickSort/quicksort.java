package com.QuickSort;

public class quicksort {

    public static int partition(int [] arr, int low, int high) {
        int pi = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pi) {
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    public static void swap(int [] arr,int i, int j){
        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void quick_sort(int []arr, int low, int high){
        if(low < high){
            int pi = partition(arr,low,high);
            quick_sort(arr,low,pi-1);
            quick_sort(arr,pi+1,high);
        }
    }
    public static void print(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1){
                System.out.println(arr[i]);
            }else{
                System.out.print(arr[i]+ ",");
            }
        }
    }

    public static void main(String[] args) {
        int [] test = {4,-1,6,8,0,5,-3};
        print(test);
        quick_sort(test,0,test.length-1);
        print(test);

    }
}

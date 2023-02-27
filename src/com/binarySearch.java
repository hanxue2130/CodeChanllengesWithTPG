package com;

public class binarySearch {
    public static int [] a = {1,2,3,4,5,6,7,8,9,10};

    public static void main(String[] args) {
        System.out.println(binarySearch());
    }

    public static int binarySearch() {
        int result = 8;
        int left = 0, right = a.length - 1;
        while (left <= right) {
            int pivot = (left + right) / 2;
            if (a[pivot] > result) {
                right = pivot - 1;
            } else if (a[pivot] < result) {
                left = pivot + 1;
            } else {
                return pivot;
            }
        }
        return -1;
    }
}

package com.code.Challenges.MedianOfTwoSortedArray;

public class test {

    public static void method1(int[] nums1, int[] nums2){
        int n1 =nums1.length, n2 = nums2.length;
        int [] n = new int [n1+n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2 ){
            if(nums1[i] < nums2[j]){
                n[k++] = nums1[i++];
            }else{
                n[k++] = nums2[j++];
            }
        }
        while (i<n1){
            n[k++] = nums1[i++];
        }
        while (j<n2){
            n[k++] = nums2[j++];
        }

        display(n);
        calculate(n);
    }
    public static void main(String[] args) {
        int [] nums1 = {1,3}, nums2 = {2};
        method1(nums1,nums2);
    }

    public static void display(int [] arrs){
        for(int arr:arrs){
            System.out.print(arr+" ");
        }
    }
    public static void calculate(int [] n){
        System.out.println(n.length%2 == 1 ? (double)n[(n.length-1)/2] : (double)(n[n.length/2-1] + n[n.length/2])/2);
    }
}

package com.MergeIntervals;

public class mergeIntervals {
    public static void main(String[] args) {
        int aa [][] = {{1,3},{2,6},{8,10},{15,18}};

        for (int [] a:aa) {
            int x = a[0], y = a[1];

        }

    }
    public static void getFormat(){
        String a = "[[1,3],[2,6],[8,10],[15,18]]";
        a = a.replaceAll("\\[","{");
        a = a.replaceAll("\\]","}");
        System.out.println(a);
    }
}

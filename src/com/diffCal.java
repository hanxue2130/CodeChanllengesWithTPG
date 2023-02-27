package com;

public class diffCal {
    public static void main(String[] args) {


        for (int i = 100; i < 1000 ; i++) {
            int f = i % 10;
            int s = i / 10 % 10;
            int t = i / 100 ;
            if( i == f * f * f + s * s * s + t * t * t){
                System.out.println(i);
            }
        }
    }
}

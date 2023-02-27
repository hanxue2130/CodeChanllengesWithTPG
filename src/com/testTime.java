package com;

import java.util.Arrays;

public class testTime {
    public static void main(String[] args) {

    }
    public static void method1(){
        int x = 15;
        for(int i = 1; i <= 15; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("fizzbuzz");
            }
            else if (i % 3 == 0){
                System.out.println("fizz");
            }
            else if (i % 5 == 0){
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }
        }
    }
    public static void method2(){
//        int [] a  = {3,4,5,7,8};
        int [] a = {1,3,7,6};
        Arrays.sort(a);
        if(a.length % 2 == 0){
            System.out.println((a[a.length /2] + a[a.length/2-1])/2);
        }
        else if (a.length % 2 !=0){
            System.out.println(a[a.length/2]);
        }
    }

}

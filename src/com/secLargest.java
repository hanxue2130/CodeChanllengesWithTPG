package com;

public class secLargest {
    public static void main(String[] args) {
        int [] a = {1,3,4,5,6,7,8,11,13};

        int lar = 0;
        int seLar = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>lar){
                seLar = lar;
                lar = a[i]; //before its update

            }
            else if(a[i]>seLar){
                seLar = a[i];
            }
        }
        System.out.println(seLar + " " +lar);
    }
}

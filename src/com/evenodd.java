package com;

import java.util.ArrayList;

public class evenodd {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};
        int j = 0;
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2 != 0){
                b.add(a[i]);
            }
            j++;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0){
                b.add(a[i]);
            }
        }
        for (int i = 0; i < b.size(); i++) {
            System.out.println(b.get(i));
        }
    }

}

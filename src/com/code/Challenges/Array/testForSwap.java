package com.code.Challenges.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class testForSwap {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        Collections.swap(a,0,2);

        for(Integer i : a){
            System.out.println(i);
        }
    }
}

package com;

import java.util.HashMap;

public class testingofHashmap {
    public static void main(String[] args) {
        int [] a = {1,1,2,3,4,5,6,7,9,7,23};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            hm.put(a[i],hm.getOrDefault(a[i],0)+1);
        }

        for(Integer i:hm.keySet()){
//            System.out.print(i);
            if(findPrime(i)){
                System.out.print(i + ",");
            }
        }
    }
    public static boolean findPrime(int n){
        if(n == 1 || n == 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}

package com;

import java.util.*;

public class TopK {

    public static void main(String[] args) {

    }
    public static List<String> method1(String[] words, int k){
            List<String> res = new ArrayList<>();
            TreeMap<String,Integer> tmap = new TreeMap<>();
            for(String s : words)
                tmap.put(s,tmap.getOrDefault(s,0) + 1);
            TreeMap<Integer,String> treemap = new TreeMap<>(Collections.reverseOrder());
            for(Map.Entry m : tmap.entrySet()){
                // If key value is not present put it normally.
                if(treemap.get(m.getValue()) == null)
                    treemap.put((Integer)m.getValue(),(String)m.getKey());
                else{
                    // if it is present already then we just concatnate it with previously
                    // present string which is already in sorted order.
                    String val = treemap.get(m.getValue());
                    treemap.put((Integer)m.getValue(),val + " " + (String)m.getKey());
                }
            }
            for(Map.Entry m : treemap.entrySet()){
                if(k>0){
                    // Take the values and split it against backspace
                    String str = (String)m.getValue();
                    String[] arr = str.split(" ");
                    // Just put it in our res and reduce value of k until it becomes zero.
                    for(int i = 0; i<arr.length; i++){
                        if(k>0){
                            res.add(arr[i]);
                            k--;
                        }
                    }
                }
            }
            return res;
        }

}

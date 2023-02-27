package com.code.Challenges.Array;

import java.util.ArrayList;
import java.util.List;

public class testOfCombination {
    static List<String> myList= new ArrayList<>();
    public static void main(String[] args) {
        String a  = "abc";
        permutation("",a,3);
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
    private static void permutation(String prefix, String str,int con) {
        int n = str.length();
        if(prefix.length() == con)
            myList.add(prefix);
        if(n > 0) {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n),con);
        }
    }
}

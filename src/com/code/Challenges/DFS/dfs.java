package com.code.Challenges.DFS;

import java.util.ArrayList;
import java.util.List;

public class dfs {

    static List<String> ans = new ArrayList<>();
    static String[] keyPad = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static void main(String[] args) {
       letterCombinations("234");
        for (int i = 0; i < ans.size(); i++) {
            if(i<ans.size()-1)
            System.out.print(ans.get(i)+",");
            else{
                System.out.println(ans.get(i));
            }
        }
    }
    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;
        backtrack(digits, 0, new StringBuilder(digits));
        return ans;
    }

    static void backtrack(String digits, int i, StringBuilder sb) {
        if (i == digits.length()) {
            ans.add(sb.toString());
            return;
        }
        int d = digits.charAt(i) - '0';
        for (char c : keyPad[d].toCharArray()) {
            sb.setCharAt(i, c);
            backtrack(digits, i+1, sb);
        }
    }
}

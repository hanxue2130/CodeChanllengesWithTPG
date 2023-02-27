package com.code.Challenges.Palindrome;

public class palindrome {
    public static void main(String[] args) {
        String s = "race a car";
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))&& Character.isDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        String f = sb.toString();
        System.out.println(check(f));
    }

    public static boolean check(String f){
        for(int i = 0;i < f.length() / 2 ;i++){
            if(f.charAt(i)!=f.charAt(f.length()-i-1)){
                return false;
            }
        }
        return true;
    }
}

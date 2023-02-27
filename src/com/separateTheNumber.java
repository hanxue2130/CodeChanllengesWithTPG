package com;

public class separateTheNumber {
    public static void main(String[] args) {

        int q = 1;
        for(int i = 0; i < q; i++){
            String in = "99100";
            long a = check(in);
            if (a != -1) {
                System.out.println("YES " + a);
            }
            else {
                System.out.println("NO");
            }
        }
    }

    public static long check(String s) {
        for (int j = 1; j < s.length()+1; j++) {
            long a = Long.parseLong(s.substring(0, j));
            long init = a;
            String temp = "" + a;
            int count = 1;
            while (temp.length() < s.length()) {
                a++;
                count++;
                temp += a;
            }
            if (temp.equals(s) && count >= 2) {
                return init;
            }
        }
        return -1;

    }
}

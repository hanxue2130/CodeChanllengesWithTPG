package com.code.Challenges.testForTodays;

public class test1 {
    public static void main(String[] args) {
        String s = "Nitin speaks malayalam Abcde eeff  abcba";
        method2(s);
//        method1(s);
        String [] b = s.split(" ");
    }
    public static void method2(String s){
        s = s + " "; //since the first needs to be counted
        String word = "";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!= ' '){
                word += s.charAt(i);
            }
            else{
                if(helper(word))
                    count++;
                word = "" ;
            }

        }
        System.out.println(count);
    }


    public static void method1(String s){
        int count = 0;
        String [] a = s.split(" ");
//        printout(a);
        for (int i = 0; i < a.length; i++) {
            if(helper(a[i])){
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean helper(String n){
        n = n.toLowerCase();
        for (int i = 0; i < n.length()/2; i++) {
            if(n.charAt(i)!=n.charAt(n.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void printout(String [] a){
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static boolean checkPrime(int n){
        if(n == 1 || n == 2){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

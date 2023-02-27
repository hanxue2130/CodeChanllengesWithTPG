package com.code.Challenges.Calculation;

public class factorial {
    public static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(C + " ");
                C = C * (i - k) / k;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        printPascal(n);
    }
}

package com.mylllket_inc.app;

public class Main {
    public static void main(String[] args) {
        getMinEl(5, 0.05);
    }

    public static int getMinEl(int n, double eps) {

        int min = n;
        double a = 0;
        for (int i = 1; i <= n; i++) {
            a = 1 / (Math.pow(i + 1, 2));
            if (a < eps && i < min) {
                min = i;
            }
            System.out.printf("a(%d)=%f%n", i, a);
        }
        System.out.println("Min number=" + min + " for epsilon=" + eps);
        return 0;
    }
}

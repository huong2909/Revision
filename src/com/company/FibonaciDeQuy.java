package com.company;

public class FibonaciDeQuy {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("fibonaci " + i +" "+ fibonaci(i));
        }
    }
    public static long fibonaci(int n){
        if (n<3){
            return 1;
        }
        return fibonaci(n - 1) + fibonaci(n - 2);
    }
}

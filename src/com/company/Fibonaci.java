package com.company;

public class Fibonaci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3;
        for (int i = 0; i < 10; i++) {
            if (i<=1){
                n3 = 1;
            } else {
                n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
            }
            System.out.println(n3);
        }
    }
}

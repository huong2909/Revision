package com.company;

import java.util.Scanner;

public class CanBacB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = scanner.nextInt();
        System.out.println("Nhập số b");
        int b = scanner.nextInt();
        System.out.println(Math.pow(a,(1.0/b)));
    }
}

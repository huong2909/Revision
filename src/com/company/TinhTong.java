package com.company;

import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i <= a; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}

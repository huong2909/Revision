package com.company;

import java.util.Scanner;

public class TichSoDauVaCuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a");
        int a = scanner.nextInt();
        String b = String.valueOf(a);
        String dau = b.substring(0,1);
        String cuoi = b.substring(b.length() - 1, b.length());
        System.out.println(Integer.parseInt(dau)*Integer.parseInt(cuoi));

    }
}

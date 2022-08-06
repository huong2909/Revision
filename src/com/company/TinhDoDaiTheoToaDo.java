package com.company;

import java.util.Scanner;

public class TinhDoDaiTheoToaDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tọa độ x1");
        int x1 = scanner.nextInt();
        System.out.println("Nhập tọa độ y1");
        int y1 = scanner.nextInt();
        System.out.println("Nhập tọa độ x2");
        int x2 = scanner.nextInt();
        System.out.println("Nhập tọa độ y2");
        int y2 = scanner.nextInt();
        System.out.println("Độ dài là " + Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));
    }
}

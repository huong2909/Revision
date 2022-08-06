package com.company;

import java.util.Scanner;

public class GiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập số tính giai thừa");
            Long x = scanner.nextLong();
            Long kq = 1L;
            for (int i = 1; i <= x; i++) {
                kq *= i;
            }
            System.out.println(+kq);
        }
        }

}

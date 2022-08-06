package com.company;

public interface Demo {
    void demo();//chưa triển khai

    default void demo1() {//mặc định hàm như thế, implement thì k phải triển khai nữa
        System.out.println("ok không");
    }
}

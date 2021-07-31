package com.aca.week4;

public class PagePrinter {

    public void print(int number, String content) {
        System.out.println(number);
        printContent(number, content);
        System.out.println("      Page " + number);
    }

    public void printContent(int number, String content) {
        System.out.println(content);
    }
}

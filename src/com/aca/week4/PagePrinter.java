package com.aca.week4;

public abstract class PagePrinter {

    public void print(int number, String content) {
        System.out.println(number);
        printContent(number, content);
        System.out.println("      Page " + number);
    }

    abstract public void printContent(int number, String content);
}

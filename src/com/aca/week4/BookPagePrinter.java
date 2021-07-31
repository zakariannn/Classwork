package com.aca.week4;

public class BookPagePrinter extends PagePrinter {
    private String publisher;

    public BookPagePrinter(String publisher) {
        this.publisher = publisher;
    }

/*    @Override
    public void print(int number, String content) {
        System.out.println(number);
        printContent(number, content);
        System.out.println("      Page " + number);
    }*/

    @Override
    public void printContent(int number, String content) {
        System.out.println(this.publisher);
        super.printContent(number, content);

    }
}

package com.aca.week4;

public class SchoolBookPagePrinter extends PagePrinter {
    private final String schoolName;

    public SchoolBookPagePrinter(String schoolName) {
        this.schoolName = schoolName;
    }

  /*  @Override
    public void print(int number, String content) {
        System.out.println(number);
        printContent(number, content);
        System.out.println("      Page " + number);
    }*/

    @Override
    public void printContent(int number, String content) {
        super.printContent(number, content);
        if(number == 17)
        {
            System.out.println(this.schoolName);
        }
    }
}

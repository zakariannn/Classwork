package com.aca.week4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select Printer");
        System.out.println("Type 1 for SchoolBookPrinter");
        System.out.println("Type  for BookPrinter");
        int printerName = scanner.nextInt();
        PagePrinter pagePrinter = getPagePrinter(printerName);

      /*  if (printerName == 1) { ;
            printTwoPages(new SchoolBookPagePrinter("school name"));
        } else {

            printTwoPages(new BookPagePrinter("school name"));

        }*/
        /*PagePrinter pagePrinter = new SchoolBookPagePrinter("name");
        pagePrinter.printContent(1, "content");*/

    }
    private static void printTwoPages(PagePrinter pagePrinter) {
        pagePrinter.print(1, "content");
        pagePrinter.print(17, "content");
    }

    private static PagePrinter getPagePrinter(int id)
    {
        if(id == 1)
        {
            return new BookPagePrinter("publisher");
        }else {
            return new SchoolBookPagePrinter("school name");
        }
    }
}

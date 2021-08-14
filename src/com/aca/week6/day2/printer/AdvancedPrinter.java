package com.aca.week6.day2.printer;

public class AdvancedPrinter <K, V> {
    void print(K[] arr){
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }
    void print(V[] arr){
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>();
        Integer[] i = new Integer[2];
        printer.print(i);
        String[] str = new String[3];
        printer.print(str);

    }
}

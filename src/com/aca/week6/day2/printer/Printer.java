package com.aca.week6.day2.printer;

public class Printer<T> {

    void print(T[] arr){
        for(int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>();
        Integer[] i = new Integer[2];
        printer.print(i);
        Printer<String> printer2 = new Printer<>();
        String[] str = new String[3];
        printer2.print(str);

    }
}

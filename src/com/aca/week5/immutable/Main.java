package com.aca.week5.immutable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Symbol:  ");
        final String symbol = scanner.next();

        System.out.println("Count:  ");
        final int count = scanner.nextInt();
        //String result = " ";
        StringBuilder result = new StringBuilder(count+50);

        final long start = System.currentTimeMillis();
        for(int i = 0; i < count; ++i)
        {
            //result = result + symbol;
            result.append(symbol);
        }
        System.out.println(result);
        System.out.println(System.currentTimeMillis() - start);

    }
}

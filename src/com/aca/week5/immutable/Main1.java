package com.aca.week5.immutable;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

    }

    public static int getIntegerFromScanner(Scanner scanner, String message) {
        int i = 0;
        boolean repeat = true;

        while (repeat) {
            try {
                System.out.println("message");
                i = scanner.nextInt();
                repeat = false;
            } catch (InputMismatchException e) {
                System.out.println("invalid value");
                repeat = true;
            }
        }
        return i;
}
}


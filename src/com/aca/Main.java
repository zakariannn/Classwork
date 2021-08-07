package com.aca;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);

        change(a);
        System.out.println(a);
        /*final double result = divide(1, 0);
        System.out.println(result);*/
        Scanner scanner = new Scanner(System.in);
        try{
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            System.out.println(
                    b == 0 ? "c is invalid" : divide(b, c)
            );
        } catch (InputMismatchException e){
            System.out.println("Place to recover");
        }


        /*if( b == 0) {
            System.out.println("c is invalid");
        }else{
            final double result = divide(b, c);
            System.out.println(result);
        }*/


    }

    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("b is 0");

        }
        return a / b;
    }

    public static int change(int a) {
        a = 77;
        return a;
    }
}

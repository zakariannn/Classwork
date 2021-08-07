package com.aca.week5;

public class Test {
    public static void main(String[] args) {
        RuntimeException e = new OurException();
        try {
            method();
        } catch (StackOverflowError a){
            System.out.println("Error");
        }
    }

    public static void method() {
        method();
    }

}

package com.aca.week5;

public class Main {

    public static void main(String[] args) {

        /*Integer result = null;

        try {
            result = calculate(-1, 10);
        } catch (RuntimeException e) {
            e.printStackTrace();//info te vorteghica ekel mer error@
        }
        System.out.println(result);*/
        try{
            method1();
        }catch (Exception e) {

        }
        // write your code here
    }
    public static void method1() throws Exception{

        calculate(10,-10);
    }

    public static Integer calculate(int a, int b) throws Exception{
        if (a < 0) {
            throw new Exception();
            /*System.err.println("Error occurred");
            RuntimeException e = new RuntimeException();
            throw e;*/
        }
        return null;
    }
//    throw new Exception;
}
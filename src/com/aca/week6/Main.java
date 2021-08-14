package com.aca.week6;

public class Main {
    public static void main(String[] args) {
        System.out.println(allDigitsAreOdd(4211133));
    }
    public static boolean allDigitsAreOdd(int num)
    {
        int x = num % 10;
        if(x % 2 == 0)
        {
            return false;
        }
        num /= 10;
        if(num == 0)
            return true;
        else
            return allDigitsAreOdd(num);
    }
}

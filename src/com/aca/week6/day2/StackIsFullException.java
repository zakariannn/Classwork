package com.aca.week6.day2;

public class StackIsFullException extends RuntimeException{
    public StackIsFullException(int maxSize) {
        super("Stack max size " + maxSize + " is exceeded");

    }
}

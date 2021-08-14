package com.aca.week6.buffer;

public interface Buffer<T> {
    T get();
    void put(T object);
}

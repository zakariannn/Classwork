package com.aca.week6.buffer;

import com.aca.week6.order.Order;
import com.aca.week6.order.User;

import java.util.NoSuchElementException;
import java.util.Objects;

public class BufferImpl<T> implements Buffer<T> {
    private T value;



    @Override
    public T get() {
        if (this.value == null)
            throw new NoSuchElementException("Buffer is empty");
        T temp = value;
        value = null;
        return temp;
    }

    @Override
    public void put(T object) {
        if (this.value != null) {
            throw new IllegalStateException("Buffer is full");
        }
        this.value = object;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BufferImpl)) return false;
        BufferImpl b = (BufferImpl) o;
        return this.value == b.value;
    }

    @Override
    public String toString() {
        return "BufferImpl{" +
                "value=" + value +
                '}';
    }

    public static void main(String[] args) {
      /*  final Buffer buffer = new BufferImpl();
        buffer.put(new User(""));*/
        Buffer<User> userBuffer = new BufferImpl<>();
        userBuffer.put(new User("name"));
        final User user = userBuffer.get();
        System.out.println(user);
    }


}

package com.aca.week6.day2;

public class StackImpl<T> implements Stack<T> {
    private static final int STACK_SIZE = 5;
    public int index;
    private T[] objects;

    public StackImpl() {
        objects = (T[]) new Object[STACK_SIZE];
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
       /* Stack stack = new StackImpl();
        final String o = "5533";
        stack.push(o);
        String pop = (String) stack.pop();
        System.out.println(pop);*/
        Stack<Integer> stack = new StackImpl<>();
        stack.push(50);
        stack.push(40);
        stack.push(30);
        stack.push(20);
        final Integer pop = stack.pop();
        System.out.println(pop);
    }

    @Override
    public void push(T o) {
        if (o == null) {
            throw new IllegalArgumentException("null value was pushed to stack");
        }
        if (index < STACK_SIZE) {
            objects[index] = o;
            ++index;
        } else {
            throw new StackIsFullException(STACK_SIZE);
        }

    }

    @Override
    public T pop() {
        if (index == 5)
            --index;
        index--;
        final T object = objects[index];
        return object;
    }
}


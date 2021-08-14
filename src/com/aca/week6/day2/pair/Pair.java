package com.aca.week6.day2.pair;

public final class Pair<T, F> {
    private final T key;
    private final F value;

    public Pair(T key, F value) {
        if(key == null){
            throw new IllegalArgumentException("The key should not be null");
        }
        if(value == null){
            throw new IllegalArgumentException("The value should not be null");
        }
        this.key = key;
        this.value = value;
    }
    public T getKey(){
        return key;
    }
    public F getValue(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair)) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return getKey().equals(((Pair<?, ?>) o).getKey()) && getValue().equals(((Pair<?, ?>) o).getValue());
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + getKey() +
                ", value=" + getValue() +
                '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Key", 5);
        System.out.println(pair);
        printPair(pair);
    }

    static void printPair(Pair<?, ?> p)
    {
        System.out.println(p);
    }
}

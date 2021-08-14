package com.aca.week6.order;

import java.util.Objects;

public class Order implements Comparable<Order> {
    private final Integer price;
    private final String recipient;

    public Order(Integer price, String recipient) {
        this.price = price;
        this.recipient = recipient;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcde";
        System.out.println(s1.compareTo(s2));
    }

    public Integer getPrice() {
        return price;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return "Order{" +
                "price=" + price +
                ", to='" + recipient + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        final Order order = (Order) o;
        return Objects.equals(getPrice(), order.getPrice()) && Objects.equals(getRecipient(), order.getRecipient());
    }

    @Override
    public int compareTo(Order o) {
        Order order = (Order) o;
        int result = this.getPrice().compareTo(order.getPrice());
        if (result == 0) {
            return getRecipient().compareTo(order.getRecipient());
        }
        return result;
    }


}

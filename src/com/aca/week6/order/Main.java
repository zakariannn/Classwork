package com.aca.week6.order;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("abs");
        User user2 = new User("abdc");
        Order order1 = new Order(10, "name");
        System.out.println(user1.compareTo(user2));
        Order[] arr = new Order[5];
        for(int i = 0; i < 5; ++i)
        {
            arr[i] = new Order(i, "");
        }

        Arrays.sort(arr);

        for(int i = 0; i < 5; ++i)
        {
            System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}

package com.aca.week6.day2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(15);
        integers.add(20);

        printList(list);
        System.out.println();
        printList(integers);
        final String s = list.get(3);
    }
    public static void printList(List<?> list)
    {
        for(int i = 0; i < list.size(); ++i)
        {
            System.out.println(list.get(i));
        }

    }
}

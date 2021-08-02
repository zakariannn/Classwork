package com.aca.week4.immutable;

import java.util.Date;

public final class User {
    private final String name;
    private  final Date birthDate;

    public User(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
       return (Date) birthDate.clone();

    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public static void main(String[] args) {
        Date date = new Date();
        User user1 = new User("name", date);
        System.out.println(user1);
        date.setTime(System.currentTimeMillis()-1000000000);
        System.out.println(user1);

    }
}

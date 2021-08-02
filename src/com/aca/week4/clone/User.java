package com.aca.week4.clone;

import java.util.Objects;

public class User implements Cloneable {
    private String name;
    private int age;
    private User friend;

    public User getFriend() {
        return friend;
    }

    public void setFriend(User friend) {
        this.friend = friend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User)) return false;
        if (o == null || getClass() != o.getClass()) return false;
        final User user = (User) o;
        return user.getAge() == this.getAge() && user.getName() == this.getName();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected User clone() throws CloneNotSupportedException {
        final User clonned = (User) super.clone();
        if(clonned.getFriend() != null) {
            clonned.setFriend(clonned.getFriend().clone());
        }
        return clonned;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User();
        user.setAge(10);
        user.setName("A");

        User user1 = new User();
        user1.setAge(10);
        user1.setName("A");

        System.out.println(user.equals(user1));
        User user3 = (User) user.clone();
        System.out.println(user.equals(user3));
        System.out.println(user == user3);


    }
}

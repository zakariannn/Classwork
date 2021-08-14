package com.aca.week6.order;

public class User implements Comparable<User>{
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User(String name) {
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User object) {
        if(!(object instanceof User)) {
            throw new UserCompareException("object's class is:" + object.getClass());
        }
        final User user = (User) object;
        return getName().compareTo(((User) object).getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

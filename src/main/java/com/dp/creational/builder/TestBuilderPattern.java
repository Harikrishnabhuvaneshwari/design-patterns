package com.dp.creational.builder;

public class TestBuilderPattern {
    public static void main(String[] args) {
        User user1 = new User.UserBuilder("Hari Krishna", "Prakash").build();

        User user2 = new User.UserBuilder("Ram", "Kumar")
                .age(23)
                .salary(1500000)
                .address("Shoolagiri")
                .mobileNo("8094567390")
                .build();

        System.out.println(user1);
        System.out.println(user2);
    }
}

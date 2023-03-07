package com.dp.creational.builder;

import lombok.Getter;

@Getter
public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final long salary;
    private final String address;
    private final String mobileNo;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.salary = userBuilder.salary;
        this.address = userBuilder.address;
        this.mobileNo = userBuilder.mobileNo;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                '}';
    }

    protected static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private long salary;
        private String address;
        private String mobileNo;

        UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        UserBuilder salary(long salary) {
            this.salary = salary;
            return this;
        }

        UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        UserBuilder mobileNo(String mobileNo) {
            this.mobileNo = mobileNo;
            return this;
        }

        User build() {
            User user = new User(this);
            return user;
        }
    }
}

package com.dp.creational.prototype;

public class Book {

    private int bID;
    private String bName;

    public Book(int bID, String bName) {
        this.bID = bID;
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bID=" + bID +
                ", bName='" + bName + '\'' +
                '}';
    }
}

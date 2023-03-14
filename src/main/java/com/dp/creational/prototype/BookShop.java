package com.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop {

    private String name;
    private List<Book> books;

    public BookShop() {
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    void loadBooks() {
        // imagine here the books are loaded from database.
        for (int i = 1; i <= 5; i++) {
            this.getBooks().add(new Book(i, "Book" + i));
        }
    }

    @Override
    protected BookShop clone() throws CloneNotSupportedException {
        // this will do shallow copy, but we need deep copy in case if the fields are mutable ones.
        // return super.clone();
        BookShop bookShop = new BookShop();
        for (Book b:this.getBooks()) {
            bookShop.getBooks().add(b);
        }
        return bookShop;
    }

    @Override
    public String toString() {
        return "BookShop{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }
}

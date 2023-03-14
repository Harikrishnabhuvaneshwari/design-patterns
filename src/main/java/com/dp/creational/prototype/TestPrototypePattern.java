package com.dp.creational.prototype;

public class TestPrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        // prototype object
        BookShop bookShop1 = new BookShop();
        bookShop1.setName("KP_Book_Stall");
        bookShop1.loadBooks();
        System.out.println("bookShop1 : "+bookShop1);

        // creating new object by cloning from bookshop1.
        BookShop bookShop2 = bookShop1.clone();
        bookShop2.setName("Murugan_Book_Stall");

        // removing an item from bookshop1, this won't affect bookshop2 object as we are doing deep copy inside clone method.
        bookShop1.getBooks().remove(3);
        System.out.println("bookShop1 : "+bookShop1);

        System.out.println("bookShop2 : "+bookShop2);
    }

}

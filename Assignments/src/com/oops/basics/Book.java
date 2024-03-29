package com.oops.basics;

public class Book {
        String bookname;
        int bookId;
        double price;


    public Book(String bookname, int bookId, double price){
            this.bookname = bookname;
            this.bookId = bookId;
            this.price = price;
        }

        void getDetails () {

            System.out.println("Name " + bookname);
            System.out.println("Id " + bookId);
            System.out.println("salary " + price);
        }
        void checkBookType () {
            if (price > 500) {
                System.out.println("Premium Book");
            } else
                System.out.println("Standerd Book");
        }
    }

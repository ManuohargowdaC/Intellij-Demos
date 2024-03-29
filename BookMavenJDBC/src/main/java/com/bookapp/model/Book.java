package com.bookapp.model;

public class Book {
    private  String author;
    private String bookTitle;
    private String catagory;
    private int bookId;
    private  double price;

    public Book() {
    }

    public Book(String author, String bookTitle, String catagory, int bookId, double price) {
        this.author = author;
        this.bookTitle = bookTitle;
        this.catagory = catagory;
        this.bookId = bookId;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", catagory='" + catagory + '\'' +
                ", bookId=" + bookId +
                ", price=" + price +
                '}';
    }
}

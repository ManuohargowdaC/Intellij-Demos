package com.list.custom;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private String bookTitle;
    private String author;
    private double price;

    @Override
    public int compareTo(Book o) {
      //  return this.getBookTitle().compareTo(o.getBookTitle());
      //  return this.getAuthor().compareTo(o.getAuthor());
        Double price1= this.getPrice();
        return  ((Double)this.getPrice()).compareTo(o.getPrice());
    }

    public Book() {
        super();
    }

    public Book(String bookTitle, String author, double price) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.price = price;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
                "bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, author, price);
    }
}

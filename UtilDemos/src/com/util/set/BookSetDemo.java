package com.util.set;

import com.list.custom.Book;

import java.util.*;

public class BookSetDemo {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Java","kathy",900),
                new Book("Java","kathy",900),
                new Book("5amclub","Robin",350),
                new Book("Leadership","Robin",900),
                new Book("Spring","kathy",1900),
                new Book("JSP Servlets","kathy",900));
        System.out.println("List Book");
        for (Book book:books){
            System.out.println(book);
        }
        System.out.println();
        System.out.println("Set Books");
        Set<Book> bookSet = new TreeSet<>(books);
        for (Book book:bookSet){
            System.out.println(book);
        }
    }
}

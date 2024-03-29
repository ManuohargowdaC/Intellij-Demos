package com.bookapp.client;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import com.bookapp.service.IBookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name = sc.next();
        IBookService bookService = new IBookServiceImpl();
        List<Book> booksByCategory;

        try {
            booksByCategory = bookService.getByCategory(userCategory);
            for (Book book : booksByCategory) {
                System.out.println(book);
            }
        }catch (BookNotFoundException e){
            e.printStackTrace();
        }

        System.out.println("Find books by author");

        String userInputAuthor = sc.next();
        List<Book> booksByAuthor;

        try {
            booksByAuthor = bookService.getByAuthorStartsWith(userInputAuthor);
            for (Book book : booksByAuthor) {
                System.out.println(book);
            }}catch (BookNotFoundException e){
            e.printStackTrace();
        }
    }

}

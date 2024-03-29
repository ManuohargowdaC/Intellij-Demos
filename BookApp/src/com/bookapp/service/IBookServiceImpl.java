package com.bookapp.service;

import com.bookapp.exception.BookNotFoundException;
import com.bookapp.exception.IdNotFoundException;
import com.bookapp.model.Book;
import com.bookapp.util.BookDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class IBookServiceImpl implements IBookService {
    List<Book> books;

    public IBookServiceImpl(){
        this.books=books;
    }
    @Override
    public List<Book> getAll() {
        List<Book> books= BookDetails.showBooks();
        return null;
    }

    @Override
    public List<Book> getByAuthorStartsWith(String author) throws BookNotFoundException {
        List<Book> bookByAuthor = new ArrayList<>();
        for (Book book:books){
            if(book.getAuthor().startsWith(author)){
                bookByAuthor.add(book);
            }
        }
        if (bookByAuthor.isEmpty()){
            throw new BookNotFoundException("no book found by this author");
        }
        return bookByAuthor;
    }

    @Override
    public List<Book> getByCategory(String category) throws BookNotFoundException {
        List<Book> bookByCategory = new ArrayList<>();
        for (Book book:books){
            if (book.getCatagory().equals(category)){
                bookByCategory.add(book);
            }
        }
        if (bookByCategory.isEmpty()){
            throw new BookNotFoundException("no book found by this author");
        }
        return bookByCategory;
    }

    @Override
    public List<Book> getByPriceLessThan(double price) throws BookNotFoundException {
        Double priceValue = Double.parseDouble(String.valueOf(price));
        List<Book> bookByPrice = new ArrayList<>();
        for (Book book:books){
            if (Objects.equals(book.getPrice(), price)){

            }
        }
        return null;
    }

    @Override
    public List<Book> getByAuthorContainsAndCategory(String author, String category) throws IdNotFoundException {
        return null;
    }

    @Override
    public Book getById(int bookId) throws IdNotFoundException {
        return null;
    }
}

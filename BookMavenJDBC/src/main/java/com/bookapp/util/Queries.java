package com.bookapp.util;

public class Queries {
    public static final String INSERTQUERY = "INSERT INTO BOOK(title,authour,price,category)";
    public static final String UPDATEQUERY = "UPDATE BOOK SET price=? where book_Id";
    public static final String DELETEQUERY = "DELETE FROM BOOK WHERE book_Id=?";

    public static final String SELECTQUERY = "SELECT* FROM BOOK";
    public static final String SELECTBYAUTHOURQUERY = "SELECT * from book where author=?";

}

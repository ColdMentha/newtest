package com.hiber.dao;

import com.hiber.model.Book;

import java.util.Date;
import java.util.List;

public interface BookDao {
    List<Book> selectAllBooks();

    List<Book> selectByAuthor();

    void saveBook(String name, String description, Float price, Date year, String author);

    void deleteBook(int id);

    Book findById(int id);

    void updateBook(int id, int menu);

}

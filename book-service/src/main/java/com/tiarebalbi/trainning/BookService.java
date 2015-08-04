package com.tiarebalbi.trainning;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tiarê Balbi Bonamini
 * @version 1.0.0
 */
@Service
public class BookService {

    private List<Book> books = new ArrayList<>();

    public Book add(Book book) {
        this.books.add(book);
        return book;
    }

    public List<Book> get() {
        return this.books;
    }
}

package com.scrappy.database.services;

import com.scrappy.database.dto.BookDTO;
import com.scrappy.database.model.Book;

import java.util.List;


public interface BookService {
    List<BookDTO> findAll();

    List<BookDTO> findByTitle(String title);

    List<BookDTO> test();

    void save(Book book);
    
}
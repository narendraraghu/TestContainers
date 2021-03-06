package com.narendra.testcontainer.dyb.services;

import com.narendra.testcontainer.dyb.model.Books;
import com.narendra.testcontainer.dyb.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//defining the business logic
@Service
public class BooksService {

    @Autowired
    BooksRepository booksRepository;

    //getting all books record by using the method findaAll() of CrudRepository
    public List<Books> getAllBooks() {
        List<Books> books = new ArrayList<>();
        booksRepository.findAll().forEach(books::add);
        return books;
    }

    //getting a specific record by using the method findById() of CrudRepository
    @Cacheable(cacheNames = "books", key="#id")
    public Books getBooksById(int id) {
        System.out.println("fetching book from db for "+id);
        return booksRepository.findById(id).get();
    }


    //saving a specific record by using the method save() of CrudRepository
    public Books saveOrUpdate(Books books) {
        booksRepository.save(books);
        return books;
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id) {
        booksRepository.deleteById(id);
    }

    //updating a record
    public void update(Books books, int bookid) {
        booksRepository.save(books);
    }
}
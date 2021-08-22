package com.narendra.testcontainer.dyb.controller;


import com.narendra.testcontainer.dyb.model.Books;
import com.narendra.testcontainer.dyb.services.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BooksController {
    //autowire the BooksService class



    @Autowired
    BooksService booksService;


    //creating a get mapping that retrieves all the books detail from the database
    @GetMapping("/book")
    private List<Books> getAllBooks() {
       return booksService.getAllBooks();
    }

    //creating a get mapping that retrieves the detail of a specific book

    @GetMapping("/book/{bookid}")
    private Books getBooks(@PathVariable("bookid") int bookid) {
        return booksService.getBooksById(bookid);
    }

    //creating a delete mapping that deletes a specified book
    @DeleteMapping("/book/{bookid}")
    private void deleteBook(@PathVariable("bookid") int bookid) {
        try {
            booksService.delete(bookid);
        } catch (Exception e) {

        }
    }

    //creating post mapping that post the book detail in the database
    @PostMapping("/books")
    private ResponseEntity<?> saveBook( @RequestBody Books books, BindingResult bindingResult) {

        Books books1 = booksService.saveOrUpdate(books);
        return new ResponseEntity<>(books1, HttpStatus.CREATED);
    }

    //creating put mapping that updates the book detail
    @PutMapping("/books")
    private Books update(@RequestBody Books books) {
        booksService.saveOrUpdate(books);
        return books;
    }
}

package com.narendra.testcontainer.dyb.services;

import com.narendra.testcontainer.dyb.Utils.BooksMapper;
import com.narendra.testcontainer.dyb.model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BookJDBCService {
//THis class is just for testing purpose CRUD already have lots of thing inbuilt

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public Books findByCustomerId(int id) {

        String sql = "SELECT * FROM BOOKS WHERE BOOK_ID = ?";
        System.out.println("Number of records " + jdbcTemplate.queryForObject("SELECT COUNT(*) FROM BOOKS", Integer.class));
        return jdbcTemplate.queryForObject(sql, new BooksMapper(), id);

    }
}

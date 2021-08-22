package com.narendra.testcontainer.dyb.Utils;

import com.narendra.testcontainer.dyb.model.Books;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BooksMapper implements RowMapper<Books> {
    @Override
    public Books mapRow(ResultSet rs, int rowNum) throws SQLException {
        Books books = new Books();
        books.setBookId(rs.getInt("BOOK_ID"));
        books.setAuthor(rs.getString("AUTHOR"));
        return books;
    }
}

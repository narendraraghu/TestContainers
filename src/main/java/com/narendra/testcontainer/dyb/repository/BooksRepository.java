package com.narendra.testcontainer.dyb.repository;

import com.narendra.testcontainer.dyb.model.Books;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
}
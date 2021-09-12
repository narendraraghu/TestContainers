package com.narendra.testcontainer.dyb.repository;

import com.narendra.testcontainer.dyb.model.Books;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface BooksRepository extends CrudRepository<Books, Integer>
{
    @Query(value = "DELETE FROM BOOKS where (cre_ts + INTERVAL '2' MINUTE )< SYSTIMESTAMP",nativeQuery = true)
    int purgeRecords();
}
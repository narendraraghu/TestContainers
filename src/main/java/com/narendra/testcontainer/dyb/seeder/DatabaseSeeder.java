package com.narendra.testcontainer.dyb.seeder;

import com.narendra.testcontainer.dyb.model.Books;
import com.narendra.testcontainer.dyb.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder implements CommandLineRunner {

    private BooksRepository booksRepository;


    @Autowired
    public DatabaseSeeder(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;

    }

    @Override
    public void run(String... args) throws Exception {
        booksRepository.save(new Books(5433, "Core and Advance Java", "R. Nageswara Rao", 800));
        booksRepository.save(new Books(234, "Programming with Java", "R. E. Balagurusamy", 350));
        booksRepository.save(new Books(425, "Data Structures and Algorithms in Java", "Robert Lafore", 542));
        booksRepository.save(new Books(542, "C++", "Test1Author", 810));
        booksRepository.save(new Books(874, "C", "Test2Author", 2000));
        booksRepository.save(new Books(236, "ML and Advance ML", "Test4Author", 800));


    }
}




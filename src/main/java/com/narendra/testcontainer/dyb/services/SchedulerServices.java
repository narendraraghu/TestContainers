package com.narendra.testcontainer.dyb.services;

import com.narendra.testcontainer.dyb.repository.BooksRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
@Slf4j
public class SchedulerServices {
     final BooksRepository booksRepository;

    public SchedulerServices(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    @Scheduled(fixedDelay = 120*1000L)
    public void purgeRecords() {
        log.info("Scheduler started ");
        int result = booksRepository.purgeRecords();

        log.info("Scheduler Ended "+result);

    }
}

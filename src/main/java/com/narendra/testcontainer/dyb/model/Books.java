package com.narendra.testcontainer.dyb.model;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;


//mark class as an Entity
@Entity
//defining class name as Table name
@Table
@Getter
@Setter
@NoArgsConstructor
public class Books
{
    //Defining book id as primary key
    @Id
    @Column
    private int bookId;
    @Column
    private String bookName;
    @Column(updatable = false,unique = true)
    private String author;
    @Column
    private int price;

    @Column(nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime cre_ts;

    public Books(int bookId, String bookName, String author, int price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }
}
package com.narendra.testcontainer.dyb.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


//mark class as an Entity
@Entity
//defining class name as Table name
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
 }
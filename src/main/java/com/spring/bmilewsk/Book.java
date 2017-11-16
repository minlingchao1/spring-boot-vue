package com.spring.bmilewsk;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Book {
    private @Id @GeneratedValue Long id;
    private String title;
    private String genre;
    private String author;

    public Book() {}

    public Book(String title, String genre, String author) {
        this.title = title;
        this.genre = genre;
        this.author = author;
    }
}

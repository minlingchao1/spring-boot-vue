package com.spring.bmilewsk.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "POST")
public class Post {
    @JsonIgnore
    @ManyToOne
    private Account account;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "SLUG")
    private String slug;
    @Column(name = "CONTENT")
    private String content;

    Post(String name, String slug, String content, Account account) {
        this.name = name;
        this.slug = slug;
        this.content = content;
        this.account = account;
    }

    Post() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

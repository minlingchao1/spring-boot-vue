package com.spring.bmilewsk.data.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "POST")
public class Post {
    @ManyToOne
    public Account account;

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    @Column(name = "NAME")
    public String name;
    @Column(name = "SLUG")
    public String slug;
    @Column(name = "CONTENT")
    public String content;

    public Post(String name, String slug, String content, Account account) {
        this.name = name;
        this.slug = slug;
        this.content = content;
        this.account = account;
    }

    Post() {
    }

    public Long getId() {
        return id;
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

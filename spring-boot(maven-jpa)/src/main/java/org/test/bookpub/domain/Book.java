package org.test.bookpub.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by JINSHENGJIE on 2016/1/18.
 */
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String isbn;
    private String title;
    private String description;

    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Publisher.Reviewer> reviewers;

    protected Book() { }

    public Book(Author author, String isbn, Publisher publisher, String title) {
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<Publisher.Reviewer> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<Publisher.Reviewer> reviewers) {
        this.reviewers = reviewers;
    }
}
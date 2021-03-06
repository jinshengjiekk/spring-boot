package org.test.bookpub.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.*;
import java.util.List;

/**
 * Created by JINSHENGJIE on 2016/1/18.
 */
@Entity
public class Publisher {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    protected Publisher() { }

    public Publisher(String name) {
        this.name = name;
    }

    @Entity
    public class Reviewer {
        @Id
        @GeneratedValue
        private Long id;
        private String firstName;
        private String lastName;

        protected Reviewer() { }

        public Reviewer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}

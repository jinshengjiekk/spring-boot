package org.test.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.bookpub.domain.Book;

/**
 * Created by JINSHENGJIE on 2016/1/18.
 */
@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
    Book findBookByIsbn(String isbn);
}

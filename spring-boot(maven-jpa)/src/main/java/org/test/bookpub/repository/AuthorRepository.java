package org.test.bookpub.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.test.bookpub.domain.Author;

/**
 * Created by JINSHENGJIE on 2016/1/19.
 */
@RepositoryRestResource
public interface AuthorRepository extends PagingAndSortingRepository<Author,Long> {

}

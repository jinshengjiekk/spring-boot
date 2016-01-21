package org.test.bookpub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.test.bookpub.repository.BookRepository;

/**
 * Created by JINSHENGJIE on 2016/1/18.
 */
public class StartupRunner implements CommandLineRunner{
    protected final Logger logger = LoggerFactory.getLogger(StartupRunner.class);
   /* @Override
    public void run(String... args) throws Exception {
            logger.info("hello");
    }*/

   /* @Autowired
    private DataSource ds;*/

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {
//            logger.info("Datasource: " +ds.toString());
        logger.info("Number of books: " + bookRepository.count());
    }


}

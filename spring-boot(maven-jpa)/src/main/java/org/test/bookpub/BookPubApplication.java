package org.test.bookpub;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.test.bookpub.domain.Book;
import org.test.bookpub.repository.BookRepository;
import org.test.bookpub.utils.Isbn;
import org.test.bookpub.utils.IsbnEditor;

import java.util.LinkedHashMap;
import java.util.Map;

@SpringBootApplication
public class BookPubApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookPubApplication.class, args);
    }

    @Bean
    public StartupRunner schedulerRunner() {
        return new StartupRunner();
    }

    @Autowired
    protected BookRepository bookRepository;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Isbn.class, new IsbnEditor());
    }

    @RequestMapping(value = "/{isbn}", method = RequestMethod.GET)
    public Map<String, Object> getBook(@PathVariable Isbn isbn) {
        Book book = bookRepository.findBookByIsbn(isbn.getIsbn());
        Map<String, Object> response = new LinkedHashMap<>();
        response.put("message", "get book with isbn(" + isbn.getIsbn() + ")");
        response.put("book", book);
        return response;
    }
}

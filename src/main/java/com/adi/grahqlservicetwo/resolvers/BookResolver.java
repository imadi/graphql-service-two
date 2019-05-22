package com.adi.grahqlservicetwo.resolvers;

import com.adi.grahqlservicetwo.models.Book;
import com.adi.grahqlservicetwo.repository.BookRepository;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {

    @Autowired
    private BookRepository bookRepository;


    public Book bookById(String id) {
        return bookRepository.bookById(id);
    }

}

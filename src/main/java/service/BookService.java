package service;

import neo.pro.annotation.ISBN;
import neo.pro.annotation.Loggable;
import neo.pro.domain.Book;
import neo.pro.generator.NumberGenerator;

import javax.inject.Inject;
import java.util.Date;

/**
 * Created by user on 15.09.2017.
 */
@Loggable
public class BookService {

    @Inject @ISBN
    private NumberGenerator numberGenerator;

    public Book createBook(String name, Date year, String description, float price){
        Book book = new Book(name, year, description, price);
        book.setIbsn(numberGenerator.generateNumber());
        return book;
    }
}

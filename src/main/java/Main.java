import neo.pro.domain.Book;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import service.BookService;

import java.util.Date;

/**
 * Created by user on 15.09.2017.
 */
public class Main {
    public static void main(String[] args) {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookService bookService =
                container.instance().select(BookService.class).get();
        Book book = bookService.createBook("H2G2", new Date(), "Интересная книга", 12);
                System.out.println(book.getDescription() + " name = " + book.getName() + " ^ " + book.getIbsn());
        weld.shutdown();
    }
}

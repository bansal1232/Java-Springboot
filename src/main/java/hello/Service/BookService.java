package hello.Service;

import hello.Repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("Booksname")
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    private static final Logger logger = LoggerFactory.getLogger(BookService.class);
    public void provideBookDetails(Integer bookId){
        logger.info("Bood Id={}", bookId);
        System.out.println(bookRepository.findByBookId(bookId));
    }
}

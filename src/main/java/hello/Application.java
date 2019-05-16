package hello;

import hello.Repository.BookRepository;
import hello.Service.BookService;
import hello.dto.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("books")
@SpringBootApplication
public class Application {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/{author}/{address}")
    public Object home(@PathVariable String author, @PathVariable String address) {
        Books books = new Books();
        books.setAuthotName(author);
        books.setAddress(address);
        System.out.println(books);
        bookRepository.save(books);
        return books;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context =  SpringApplication.run(Application.class, args);
        BookService bookService = context.getBean(BookService.class);
        bookService.provideBookDetails(12);
    }
}
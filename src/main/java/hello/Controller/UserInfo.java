package hello.Controller;

import hello.Repository.AuthorRepository;
import hello.dto.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserInfo {
    @Autowired
    private AuthorRepository authorRepository;

    @PostMapping("author")
    public Object getAuthorInfo(@RequestBody Author authorRequestDTO) {
        System.out.println(authorRequestDTO);
        authorRepository.save(authorRequestDTO);
        return authorRequestDTO;
    }

    @GetMapping("author/{authorId}")
    public Object getJoker(@PathVariable Integer authorId) {
        //Author author = new Author();
        List<Author> totalAuthors = authorRepository.findByAuthorId(authorId);
        System.out.println(totalAuthors);
        return totalAuthors;
    }
}

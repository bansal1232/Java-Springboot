package hello.Repository;

import hello.dto.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Books, Long> {
    List<Integer> findById(Integer id);
    List<Integer> findByBookId(Integer bookId);


}
package tiansiyu.springframework.springframework5.repositories;

import org.springframework.data.repository.CrudRepository;
import tiansiyu.springframework.springframework5.model.Book;

public interface BookRepository extends CrudRepository<Book, Long>{
}

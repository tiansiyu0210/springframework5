package tiansiyu.springframework.springframework5.repositories;

import org.springframework.data.repository.CrudRepository;
import tiansiyu.springframework.springframework5.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}

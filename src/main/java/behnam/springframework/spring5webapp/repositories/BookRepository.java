package behnam.springframework.spring5webapp.repositories;

import behnam.springframework.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {


}

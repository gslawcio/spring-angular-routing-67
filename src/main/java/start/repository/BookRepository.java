package start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import start.model.Book;

public interface BookRepository extends JpaRepository<Book,Long>{

}

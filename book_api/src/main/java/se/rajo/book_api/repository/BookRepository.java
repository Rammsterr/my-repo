package se.rajo.book_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.rajo.book_api.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Long id(Long id);
    // Here we can add custom queries to be able to integrate with the Book entity
}

package br.edu.iftm.biblioteca.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.iftm.biblioteca.domain.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
}

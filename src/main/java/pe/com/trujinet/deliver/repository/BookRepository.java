package pe.com.trujinet.deliver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.trujinet.deliver.model.Book;

public interface BookRepository extends MongoRepository<Book, String>{

}

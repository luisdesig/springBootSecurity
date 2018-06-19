package pe.com.trujinet.deliver.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import pe.com.trujinet.deliver.model.Book;
import pe.com.trujinet.deliver.repository.BookRepository;


@RestController
@RequestMapping("/rest/books")
public class bookController {

	@Autowired
	private BookRepository repository;

	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public String save(@RequestBody Book book) {
		repository.save(book);
		return "Added book with id : " + book.getId();
	}

	@GetMapping("/get/{id}")
	public Optional<Book> get(@PathVariable String id){
		return repository.findById(id);
	}

	@GetMapping("/getAll")
	public List<Book> getAll(){
		return repository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String delete(@PathVariable String id){
		repository.deleteById(id);
		return "Book deleted with id: " + id;
	}
}
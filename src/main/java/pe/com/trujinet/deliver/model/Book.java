package pe.com.trujinet.deliver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Document(collection = "Books")
public class Book {
	@Id
	private int id;
	private String nombre;
	private String autor;
	
}
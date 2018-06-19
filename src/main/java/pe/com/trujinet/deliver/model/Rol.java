package pe.com.trujinet.deliver.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Document(collection = "Roles")
public class Rol {
	@Id
	private int id;
	private String nombre;
}
package pe.com.trujinet.deliver.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Document(collection = "Users")
public class User {
	@Id
	private int id;
	private String username;
	private String email;
	private String nombres;
	private String apellidos;
	private Date nacimiento;
	private String password;
	private String[] roles;
}
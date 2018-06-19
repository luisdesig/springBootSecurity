package pe.com.trujinet.deliver.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.trujinet.deliver.model.User;

public interface UserRepository extends MongoRepository<User, String>{
}

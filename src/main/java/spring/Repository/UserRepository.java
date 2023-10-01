package spring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.domain.User;


 
public interface UserRepository extends MongoRepository<User, Long>{

	
	

}

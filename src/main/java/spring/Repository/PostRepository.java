package spring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.domain.Post;


 
public interface PostRepository extends MongoRepository<Post, Long>{

	
	

}

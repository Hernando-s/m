package spring.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import spring.domain.Post;


 
public interface PostRepository extends MongoRepository<Post, Long>{

  List<Post> findByTitleContainingIgnoreCase(String text);
	

}

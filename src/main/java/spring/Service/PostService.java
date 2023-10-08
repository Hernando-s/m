package spring.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.Repository.PostRepository;
import spring.Service.exception.ObjectNotFoundException;
import spring.domain.Post;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
	
	
	public Post findById(Long id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
		
public List<Post> findByTitle (String text){
	return repo.searchTitle(text);
}
public List<Post> fullSearch(String text, Date minDate, Date maxDate){
	maxDate = new Date(maxDate.getTime()+ 24 * 60 * 60 * 1000);
	return repo.fullSearch(text, minDate, maxDate);
}


}

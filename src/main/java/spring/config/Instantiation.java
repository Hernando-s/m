package spring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import spring.DTO.AuthorDTO;
import spring.DTO.CommentDTO;
import spring.Repository.PostRepository;
import spring.Repository.UserRepository;
import spring.domain.Post;
import spring.domain.User;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
     private UserRepository userRepository;
	
	@Autowired
    private PostRepository postRepository;
	
	@Override
	public void run(String... args0) throws Exception {
		
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
	
	userRepository.deleteAll();
    postRepository.deleteAll();
		
		User alex = new User(null, "Alex Green","Alex@gmail.com ");
		User maria = new User(null, "Maria Brown","maria@gmail.com ");
		User bob = new User(null, "Bob Grey","bob@gmail.com ");
		
		
		userRepository.saveAll(Arrays.asList(alex,maria,bob ));
		
		Post post1 = new Post(null, sdf.parse("01/10/2023"),"Partiu viagem", "Vou viajar para o piaui",new AuthorDTO(maria));
		Post post2 = new Post(null, sdf.parse("15/10/2023"),"om dia!", "Acordei hoje feliz",new AuthorDTO(maria));
		
		CommentDTO c1 = new CommentDTO("Boa viagem mano", sdf.parse("02/10/2023"),new AuthorDTO(alex));
		CommentDTO c2 = new CommentDTO("Aproveite", sdf.parse("02/10/2023"),new AuthorDTO(bob));
		CommentDTO c3 = new CommentDTO("Tenha um otimo dia", sdf.parse("12/10/2023"),new AuthorDTO(alex));
		
        post1.getComments().addAll(Arrays.asList(c1,c2));
        post2.getComments().addAll(Arrays.asList(c3));
        
		postRepository.saveAll(Arrays.asList( post1,post2));
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
	}

}
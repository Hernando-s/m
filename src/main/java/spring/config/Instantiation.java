package spring.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

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
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
	    postRepository.deleteAll();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		User Dada = new User(null, "Dada","dada@gmail.com ");
		User Dede = new User(null, "Dede","dede@gmail.com ");
		User Didi = new User(null, "Didi","didi@gmail.com ");
		User Dodo = new User(null, "Dodo","dodo@gmail.com ");
		User Dudu = new User(null, "Dudu","dudu@gmail.com ");
		
		Post post1 = new Post(null, sdf.parse("01/10/2023"),"Partiu viagem", "Vou viajar para o piaui", Dudu);
		Post post2 = new Post(null, sdf.parse("15/10/2023"),"om dia!", "Acordei hoje feliz", Dudu);
		
		userRepository.saveAll(Arrays.asList(Dada,Dede,Didi,Dodo,Dudu));
		postRepository.saveAll(Arrays.asList( post1,post2));
	}

}
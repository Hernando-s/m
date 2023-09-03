package spring.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import spring.Repository.UserRepository;
import spring.domain.User;

@Configuration
public class Instantiation implements CommandLineRunner{

	@Autowired
     private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
	
		
		User Dada = new User(null, "Dada","dada@gmail.com ");
		User Dede = new User(null, "Dede","dede@gmail.com ");
		User Didi = new User(null, "Didi","didi@gmail.com ");
		User Dodo = new User(null, "Dodo","dodo@gmail.com ");
		User Dudu = new User(null, "Dudu","dudu@gmail.com ");
		
		userRepository.saveAll(Arrays.asList(Dada,Dede,Didi,Dodo,Dudu));
		
	}

}
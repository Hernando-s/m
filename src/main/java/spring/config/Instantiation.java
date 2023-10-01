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
		User Dada1 = new User(null, "Dada","dada@gmail.com ");
		User Dede1 = new User(null, "Dede","dede@gmail.com ");
		User Didi1 = new User(null, "Didi","didi@gmail.com ");
		User Dodo1 = new User(null, "Dodo","dodo@gmail.com ");
		User Dudu1 = new User(null, "Dudu","dudu@gmail.com ");
		userRepository.saveAll(Arrays.asList( Dada1,Dada,Dede1,Dede,Didi1,Didi,Dodo1,Dodo,Dudu1,Dudu));
		
	}

}
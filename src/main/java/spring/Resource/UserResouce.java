package spring.Resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.domain.User;
@RestController
@RequestMapping(value = "/users")
public class UserResouce {
    
    @GetMapping
	public ResponseEntity< List<User>>findAll() {
		User hernando = new User(1 ,"hernando", "hernando@gmail.com");
		User duda = new User(2 ,"duda", "duda@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(hernando,duda));
		return ResponseEntity.ok().body(list); 
	}
	
}

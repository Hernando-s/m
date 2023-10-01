package spring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.DTO.UserDTO;
import spring.Repository.UserRepository;
import spring.Service.exception.ObjectNotFoundException;
import spring.domain.User;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
		
	}
	
	
	public User findById(Long id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		}
		

public User insert(User obj) {
	return repo.save(obj);
}

public void delete(Long id) {
	findById(id);
	repo.deleteById(id);
}


public User update(Long id, User obj) {
User newObj = findById(obj.getId());
updateData(newObj, obj);
return repo.save(newObj);
}



private void updateData(User newObj, User obj) {
	newObj.setNome(obj.getNome());
	newObj.setEmail(obj.getEmail());
}


public User fromDTO(UserDTO objDTO) {
	return new User(objDTO.getId(), objDTO.getNome(),objDTO.getEmail());
	
}
}

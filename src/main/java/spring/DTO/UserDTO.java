package spring.DTO;

import java.io.Serializable;

import spring.domain.User;

public class UserDTO implements Serializable{
	private static final long serialVersionUID = 1L;
 
private Long id;
 private  String nome;
 private  String email;
   
  public UserDTO (User obj) {
	  id = obj.getId();
	  nome = obj.getNome();
	  email = obj.getEmail();
	  
	  
  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
  
}

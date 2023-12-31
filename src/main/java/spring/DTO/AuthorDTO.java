package spring.DTO;

import java.io.Serializable;

import spring.domain.User;

public class AuthorDTO implements Serializable {
private static final long serialVersionUID = 1L;

	private String id;
	private String nome;
	
	
	public AuthorDTO(User obj) {
		
		id = obj.getId();
		nome = obj.getNome();
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
}

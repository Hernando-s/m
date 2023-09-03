package spring.domain;

import java.io.Serializable;
import java.util.Objects;

public class User implements Serializable{


	private static final long serialVersionUID = 1L;
private int id;
private String nome;
private String email;

public User() {
	
}

public User(int id, String nome, String email) {
	
	this.id = id;
	this.nome = nome;
	this.email = email;
}
public int getId() {
	return id;
}
public void setId(int id) {
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
@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	User other = (User) obj;
	return id == other.id;
}


}

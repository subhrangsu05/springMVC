package springmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserData {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name,email,password;
	public UserData(String userName,String userEmail,String userPassword) {
		this.name = userName;
		this.email = userEmail;
		this.password = userPassword;
	}
	@Override
	public String toString() {
		return "user-name is: "+name+", user-email is: "+email+", user-password is: "+password;
	}
}

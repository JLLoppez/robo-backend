package com.example.robo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class robos {
	
	@Id
	@SequenceGenerator(
			name= "robo_sequence",
			sequenceName= "robo_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "robo_sequence"
	)
	
	
	private Long id;
	private String name;
	private String username;
	private String email;
	public robos() {
		super();
	}
	public robos(Long id, String name, String username, String email) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
	}
	public robos(String name, String username, String email) {
		super();
		this.name = name;
		this.username = username;
		this.email = email;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "robos ["
				+ "id= " + id 
				+ ", name= " + name 
				+ ", username= " + username 
				+ ", email= " + email 
				+ ", getId()= ]";
	}
	
	

}

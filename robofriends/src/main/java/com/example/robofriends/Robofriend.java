package com.example.robofriends;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


public class Robofriend {
	
	@Id
	@SequenceGenerator(
			name= "robofriend_sequence",
			sequenceName= "robofriend_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "robofriend_sequence"
	)
	private Long id;
	private String name;
	private String username;
	private String email;
	
	public Robofriend(Long id, String name, String username, String email) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
	}

	/**
	 * @param name
	 * @param username
	 * @param email
	 */
	public Robofriend(String name, String username, String email) {
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
		return "Robofriend [id=" + id + ", name=" + name + ", username=" + username + ", email=" + email + "]";
	}

}

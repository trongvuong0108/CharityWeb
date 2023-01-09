package com.code.model;

import jakarta.persistence.*;
import java.util.Set;

@Entity
@Table(name = "role")
public class role {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@Column(name= "name")
    private String name ;
	
	@OneToMany(mappedBy = "userRole",cascade = CascadeType.ALL)
    private Set<User> users ;
	
	public role() {
	}
	public role(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "role [id=" + id + ", name=" + name + "]";
	}
	
	
}
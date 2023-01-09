package com.code.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
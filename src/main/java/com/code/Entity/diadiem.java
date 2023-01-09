
package com.code.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;


@Entity
@Data
@Table
public class diadiem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "chuy")
	private String chuy; 
	
	@Column(name = "ten")
	private String ten;

	@OneToMany(mappedBy = "diadiem",cascade = CascadeType.ALL)
    private Set<baidang> posts ;
}

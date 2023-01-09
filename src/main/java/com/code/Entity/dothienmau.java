package com.code.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Set;


@Entity
@Table
public class dothienmau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id ;

	private Date ngaybd;

	private Date ngaykt; 

	private String noidung;

	@OneToMany(mappedBy = "dothienmau",cascade = CascadeType.ALL)
	private Set<baidang> posts ;

}

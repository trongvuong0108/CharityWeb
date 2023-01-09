package com.code.Entity;

import jakarta.persistence.*;

import java.util.Date;



@Entity
@Table
public class maxacnhan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@Column(name = "maxacnhan")
	private String maxacnhan; 
	
	@Column(name = "thoigian")
	private Date thoigian; 
	
	@ManyToOne
    @JoinColumn(name = "thongtin_id",nullable = false, referencedColumnName = "id_thongtin")
	private thongtin thongtin;
}

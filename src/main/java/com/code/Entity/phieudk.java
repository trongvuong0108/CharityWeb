package com.code.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "phieudk")
public class phieudk {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@ManyToOne
    @JoinColumn(name = "thongtin_id",nullable = false, referencedColumnName = "id_thongtin")
	private thongtin thongtin;
	
	@ManyToOne
    @JoinColumn(name = "baidang_id",nullable = false, referencedColumnName = "id")
	private baidang baidang;

}

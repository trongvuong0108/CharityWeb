package com.code.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Data
public class baidang {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@Column(name = "ngaydang")
	private Date ngaydang; 
	
	@Column(name = "noidung")
	private String noidung;
	
	@ManyToOne
    @JoinColumn(name = "taikhoan_id",nullable = false, referencedColumnName = "id")
    private User user;
	
	@ManyToOne
    @JoinColumn(name = "dothienmau_id",nullable = false, referencedColumnName = "id")
    private dothienmau dothienmau;
	
	@ManyToOne
    @JoinColumn(name = "diadiem_id",nullable = false, referencedColumnName = "id")
    private diadiem diadiem;

	@OneToMany(mappedBy = "baidang",cascade = CascadeType.ALL)
	private List<phieudk> phieudks;

}

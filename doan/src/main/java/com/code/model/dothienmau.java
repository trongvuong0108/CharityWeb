package com.code.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "dothienmau")
public class dothienmau {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@Column(name = "ngaybd")
	private Date ngaybd;
	
	@Column(name = "ngaykt")
	private Date ngaykt; 
	
	@Column(name = "noidung")
	private String noidung;

	@OneToMany(mappedBy = "dothienmau",cascade = CascadeType.ALL)
	private Set<baidang> posts ;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgaybd() {
		return ngaybd;
	}

	public void setNgaybd(Date ngaybd) {
		this.ngaybd = ngaybd;
	}

	public Date getNgaykt() {
		return ngaykt;
	}

	public void setNgaykt(Date ngaykt) {
		this.ngaykt = ngaykt;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	@Override
	public String toString() {
		return "dothienmau [id=" + id + ", ngaybd=" + ngaybd + ", ngaykt=" + ngaykt + ", noidung=" + noidung + "]";
	}
	

}

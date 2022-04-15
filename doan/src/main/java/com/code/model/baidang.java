package com.code.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "baidang")
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
	
	@Override
	public String toString() {
		return "baidang [id=" + id + ", ngaydang=" + ngaydang + ", noidung=" + noidung + ", user=" + user.toString() 
				+ ", dothienmau=" + dothienmau + ", diadiem=" + diadiem  + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getNgaydang() {
		return ngaydang;
	}

	public void setNgaydang(Date date) {
		this.ngaydang = date;
	}

	public String getNoidung() {
		return noidung;
	}

	public void setNoidung(String noidung) {
		this.noidung = noidung;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public dothienmau getDothienmau() {
		return dothienmau;
	}

	public void setDothienmau(dothienmau dothienmau) {
		this.dothienmau = dothienmau;
	}

	public diadiem getDiadiem() {
		return diadiem;
	}

	public void setDiadiem(diadiem diadiem) {
		this.diadiem = diadiem;
	}
}

package com.code.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public thongtin getThongtin() {
		return thongtin;
	}

	public void setThongtin(thongtin thongtin) {
		this.thongtin = thongtin;
	}

	public baidang getBaidang() {
		return baidang;
	}

	public void setBaidang(baidang baidang) {
		this.baidang = baidang;
	}
}

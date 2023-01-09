package com.code.model;

import jakarta.persistence.*;

import java.util.Date;



@Entity
@Table(name = "maxacnhan")
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

	public thongtin getThongtin() {
		return thongtin;
	}

	public void setThongtin(thongtin thongtin) {
		this.thongtin = thongtin;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMaxacnhan() {
		return maxacnhan;
	}

	public void setMaxacnhan(String maxacnhan) {
		this.maxacnhan = maxacnhan;
	}

	public Date getThoigian() {
		return thoigian;
	}

	public void setThoigian(Date thoigian) {
		this.thoigian = thoigian;
	}

	@Override
	public String toString() {
		return "maxacnhan [id=" + id + ", maxacnhan=" + maxacnhan + ", thoigian=" + thoigian + ", thongtin=" + thongtin.toString()
				+ "]";
	}
	
}

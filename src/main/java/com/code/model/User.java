package com.code.model;

import java.sql.Date;
import java.util.Set;

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
@Table(name = "taikhoan")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;

	@Column(name = "email")
	private String email;
	
	@Column(name = "matkhau")
	private String matkhau; 
	
	@ManyToOne
    @JoinColumn(name = "role_id",nullable = false,referencedColumnName = "id")
    private role userRole;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<baidang> posts ;
	
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "hoten")
	private String hoten; 
	
	@Column(name = "phone")
	private String phone;

	@Column(name = "ngaysinh")
	private Date ngaysinh;
	
	@Column(name = "gioitinh")
	private boolean gioitinh;
	
	@Column(name = "status")
	private boolean status; 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMatkhau() {
		return matkhau;
	}

	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}


	public role getUserRole() {
		return userRole;
	}

	public void setUserRole(role userRole) {
		this.userRole = userRole;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}
	
	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", matkhau=" + matkhau +  ", diachi=" + diachi + ", hoten=" + hoten + ", phone=" + phone + ", ngaysinh=" + ngaysinh
				+ ", gioitinh=" + gioitinh + ", status=" + status +"]";
	}
}

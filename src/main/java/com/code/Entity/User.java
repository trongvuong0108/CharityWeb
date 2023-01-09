package com.code.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
	private String email;

	private String matkhau; 
	
	@ManyToOne
    @JoinColumn(name = "role_id",nullable = false,referencedColumnName = "id")
    private role userRole;
	
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<baidang> posts ;

	private String diachi;

	private String hoten; 

	private String phone;

	private Date ngaysinh;

	private boolean gioitinh;

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

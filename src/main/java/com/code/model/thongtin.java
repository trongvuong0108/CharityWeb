package com.code.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "thongtin")
public class thongtin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_thongtin")
    private int id ;

	@Column(name = "email")
	private String email;
	
	@Column(name = "ten")
	private String ten; 
	
	@Column(name = "ngaysinh")
	private String ngaysinh; 
	
	@Column(name = "diachi")
	private String diachi; 
	
	@Column(name = "sokg")
	private String sokg; 

	@Column(name = "gioitinh")
	private boolean gioitinh;
	
	@Column(name = "phone")
	private String phone; 
	
	@OneToMany(mappedBy = "thongtin",cascade = CascadeType.ALL)
	private List<phieudk> phieudks ; 
	
	@OneToMany(mappedBy = "thongtin",cascade = CascadeType.ALL)
	private List<maxacnhan> maxacnhans ;

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

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(String ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getSokg() {
		return sokg;
	}

	public void setSokg(String sokg) {
		this.sokg = sokg;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<phieudk> getPhieudks() {
		return phieudks;
	}

	public void setPhieudks(List<phieudk> phieudks) {
		this.phieudks = phieudks;
	}

	public List<maxacnhan> getMaxacnhans() {
		return maxacnhans;
	}

	public void setMaxacnhans(List<maxacnhan> maxacnhans) {
		this.maxacnhans = maxacnhans;
	}

	@Override
	public String toString() {
		return "thongtin [id=" + id + ", email=" + email + ", ten=" + ten + ", ngaysinh=" + ngaysinh + ", diachi="
				+ diachi + ", sokg=" + sokg + ", gioitinh=" + gioitinh + ", phone=" + phone + "]";
	} 
	
}

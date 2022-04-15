
package com.code.model;

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
@Table(name = "diadiem")
public class diadiem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private int id ;
	
	@Column(name = "diachi")
	private String diachi;
	
	@Column(name = "chuy")
	private String chuy; 
	
	@Column(name = "ten")
	private String ten;
	
	
	@OneToMany(mappedBy = "diadiem",cascade = CascadeType.ALL)
    private Set<baidang> posts ;
    
    
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getChuy() {
		return chuy;
	}

	public void setChuy(String chuy) {
		this.chuy = chuy;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Override
	public String toString() {
		return "diadiem [id=" + id + ", diachi=" + diachi + ", chuy=" + chuy + ", ten=" + ten + "]";
	} 
	
}

package com.code.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;



@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class thongtin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
	private String email;
	private String ten;
	private String ngaysinh;
	private String diachi;
	private String sokg;
	private boolean gioitinh;
	private String phone;
	@OneToMany(mappedBy = "thongtin",cascade = CascadeType.ALL)
	private List<phieudk> phieudks ; 
	
	@OneToMany(mappedBy = "thongtin",cascade = CascadeType.ALL)
	private List<maxacnhan> maxacnhans ;


	
}

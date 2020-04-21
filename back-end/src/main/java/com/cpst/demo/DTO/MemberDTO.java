package com.cpst.demo.DTO;

import lombok.Data;

@Data
public class MemberDTO {

	String name;
	String id;
	String pwd;
	
	public MemberDTO(String name, String id, String pwd) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
	}
	
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public String getPwd() {
		return pwd;
	}
	
}

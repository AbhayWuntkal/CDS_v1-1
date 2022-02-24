package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gender_mst {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String gen_code;
	private String gen_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGen_code() {
		return gen_code;
	}
	public void setGen_code(String gen_code) {
		this.gen_code = gen_code;
	}
	public String getGen_name() {
		return gen_name;
	}
	public void setGen_name(String gen_name) {
		this.gen_name = gen_name;
	}
	@Override
	public String toString() {
		return "Gender_mst [id=" + id + ", gen_code=" + gen_code + ", gen_name=" + gen_name + ", getId()=" + getId()
				+ ", getGen_code()=" + getGen_code() + ", getGen_name()=" + getGen_name() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

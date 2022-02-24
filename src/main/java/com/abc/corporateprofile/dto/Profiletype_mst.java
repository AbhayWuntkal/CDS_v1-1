package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Profiletype_mst {

	@Id
	private Integer id;
	private String prf_typ_code;
	private String prf_typ_name;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPrf_typ_code() {
		return prf_typ_code;
	}
	public void setPrf_typ_code(String prf_typ_code) {
		this.prf_typ_code = prf_typ_code;
	}
	public String getPrf_typ_name() {
		return prf_typ_name;
	}
	public void setPrf_typ_name(String prf_typ_name) {
		this.prf_typ_name = prf_typ_name;
	}
	@Override
	public String toString() {
		return "Profiletype_mst [id=" + id + ", prf_typ_code=" + prf_typ_code + ", prf_typ_name=" + prf_typ_name
				+ ", getId()=" + getId() + ", getPrf_typ_code()=" + getPrf_typ_code() + ", getPrf_typ_name()="
				+ getPrf_typ_name() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

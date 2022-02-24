package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Title_mst {
	
	@Id
	private Integer id;
	private String title_name;
	private String title_code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle_name() {
		return title_name;
	}
	public void setTitle_name(String title_name) {
		this.title_name = title_name;
	}
	public String getTitle_code() {
		return title_code;
	}
	public void setTitle_code(String title_code) {
		this.title_code = title_code;
	}
	@Override
	public String toString() {
		return "Title_mst [id=" + id + ", title_name=" + title_name + ", title_code=" + title_code + ", getId()="
				+ getId() + ", getTitle_name()=" + getTitle_name() + ", getTitle_code()=" + getTitle_code()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}

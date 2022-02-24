package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Userstaus_mst {

	@Id
	private Integer id;
	private String status_code;
	private String status_name;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String created_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String last_modified_date;
	private String modified_by;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getStatus_code() {
		return status_code;
	}
	public void setStatus_code(String status_code) {
		this.status_code = status_code;
	}
	public String getStatus_name() {
		return status_name;
	}
	public void setStatus_name(String status_name) {
		this.status_name = status_name;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public String getLast_modified_date() {
		return last_modified_date;
	}
	public void setLast_modified_date(String last_modified_date) {
		this.last_modified_date = last_modified_date;
	}
	public String getModified_by() {
		return modified_by;
	}
	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}
	@Override
	public String toString() {
		return "Userstaus_mst [id=" + id + ", status_code=" + status_code + ", status_name=" + status_name
				+ ", created_date=" + created_date + ", last_modified_date=" + last_modified_date + ", modified_by="
				+ modified_by + ", getId()=" + getId() + ", getStatus_code()=" + getStatus_code()
				+ ", getStatus_name()=" + getStatus_name() + ", getCreated_date()=" + getCreated_date()
				+ ", getLast_modified_date()=" + getLast_modified_date() + ", getModified_by()=" + getModified_by()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

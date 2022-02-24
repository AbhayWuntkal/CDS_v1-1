package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Roles {
	
	@Id
	private Integer role_id;
	private String  name;
	private String  description;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String  created_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String  last_modified_date;
	  
	private String  modified_by;
	private Integer company_branch_id;
	private Boolean is_enabled = false;
	public Integer getRole_id() {
		return role_id;
	}
	public void setRole_id(Integer role_id) {
		this.role_id = role_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
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
	public Integer getCompany_branch_id() {
		return company_branch_id;
	}
	public void setCompany_branch_id(Integer company_branch_id) {
		this.company_branch_id = company_branch_id;
	}
	public Boolean getIs_enabled() {
		return is_enabled;
	}
	public void setIs_enabled(Boolean is_enabled) {
		this.is_enabled = is_enabled;
	}
	@Override
	public String toString() {
		return "Roles [role_id=" + role_id + ", name=" + name + ", description=" + description + ", created_date="
				+ created_date + ", last_modified_date=" + last_modified_date + ", modified_by=" + modified_by
				+ ", company_branch_id=" + company_branch_id + ", is_enabled=" + is_enabled + ", getRole_id()="
				+ getRole_id() + ", getName()=" + getName() + ", getDescription()=" + getDescription()
				+ ", getCreated_date()=" + getCreated_date() + ", getLast_modified_date()=" + getLast_modified_date()
				+ ", getModified_by()=" + getModified_by() + ", getCompany_branch_id()=" + getCompany_branch_id()
				+ ", getIs_enabled()=" + getIs_enabled() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}

package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "departmentmasterbycorporate")
public class Department_Master_by_Corporate {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer dep_id;
	private Integer dep_mst_id;
	private Integer id;
	private String dep_name;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String dep_created_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String dep_modified_date;
	  
	private String dep_modified_by;
	private Boolean dep_is_enabled = false;
	private String dep_account_code;
	public Integer getDep_id() {
		return dep_id;
	}
	public void setDep_id(Integer dep_id) {
		this.dep_id = dep_id;
	}
	public Integer getDep_mst_id() {
		return dep_mst_id;
	}
	public void setDep_mst_id(Integer dep_mst_id) {
		this.dep_mst_id = dep_mst_id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getDep_created_date() {
		return dep_created_date;
	}
	public void setDep_created_date(String dep_created_date) {
		this.dep_created_date = dep_created_date;
	}
	public String getDep_modified_date() {
		return dep_modified_date;
	}
	public void setDep_modified_date(String dep_modified_date) {
		this.dep_modified_date = dep_modified_date;
	}
	public String getDep_modified_by() {
		return dep_modified_by;
	}
	public void setDep_modified_by(String dep_modified_by) {
		this.dep_modified_by = dep_modified_by;
	}
	public Boolean getDep_is_enabled() {
		return dep_is_enabled;
	}
	public void setDep_is_enabled(Boolean dep_is_enabled) {
		this.dep_is_enabled = dep_is_enabled;
	}
	public String getDep_account_code() {
		return dep_account_code;
	}
	public void setDep_account_code(String dep_account_code) {
		this.dep_account_code = dep_account_code;
	}
	@Override
	public String toString() {
		return "Department_Master_by_Corporate [dep_id=" + dep_id + ", dep_mst_id=" + dep_mst_id + ", id=" + id
				+ ", dep_name=" + dep_name + ", dep_created_date=" + dep_created_date + ", dep_modified_date="
				+ dep_modified_date + ", dep_modified_by=" + dep_modified_by + ", dep_is_enabled=" + dep_is_enabled
				+ ", dep_account_code=" + dep_account_code + ", getDep_id()=" + getDep_id() + ", getDep_mst_id()="
				+ getDep_mst_id() + ", getId()=" + getId() + ", getDep_name()=" + getDep_name()
				+ ", getDep_created_date()=" + getDep_created_date() + ", getDep_modified_date()="
				+ getDep_modified_date() + ", getDep_modified_by()=" + getDep_modified_by() + ", getDep_is_enabled()="
				+ getDep_is_enabled() + ", getDep_account_code()=" + getDep_account_code() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

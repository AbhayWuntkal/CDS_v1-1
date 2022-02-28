package com.abc.corporateprofile.travelpolicy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.abc.corporateprofile.dto.Company;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Departments {
	
	@Id
	@Column(name = "department_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer department_id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Company id;

	@Column(name="department_name")
	private String department_name;
	
	@Column(name="department_code")
	private String department_code;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "created_date")
	private String created_date;
	
	@Column(name = "created_by")
	private String  created_by ;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "modified_date")
	private String  modified_date ;
	
	@Column(name = "modified_by")
	private String modified_by;
	
	// Methods
	public Departments() {
	  }

	  public Departments(String department_name, String department_code) {
	    this.department_name = department_name;
	    this.department_code = department_code;
	  }

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Company getId() {
		return id;
	}

	public void setId(Company id) {
		this.id = id;
	}

	public String getDepartment_name() {
		return department_name;
	}

	public void setDepartment_name(String department_name) {
		this.department_name = department_name;
	}

	public String getDepartment_code() {
		return department_code;
	}

	public void setDepartment_code(String department_code) {
		this.department_code = department_code;
	}

	public String getCreated_date() {
		return created_date;
	}

	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_date() {
		return modified_date;
	}

	public void setModified_date(String modified_date) {
		this.modified_date = modified_date;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
	}

	@Override
	public String toString() {
		return "Departments [department_id=" + department_id + ", id=" + id + ", department_name=" + department_name
				+ ", department_code=" + department_code + ", created_date=" + created_date + ", created_by="
				+ created_by + ", modified_date=" + modified_date + ", modified_by=" + modified_by
				+ ", getDepartment_id()=" + getDepartment_id() + ", getId()=" + getId() + ", getDepartment_name()="
				+ getDepartment_name() + ", getDepartment_code()=" + getDepartment_code() + ", getCreated_date()="
				+ getCreated_date() + ", getCreated_by()=" + getCreated_by() + ", getModified_date()="
				+ getModified_date() + ", getModified_by()=" + getModified_by() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

package com.abc.corporateprofile.travelpolicy.dto;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.abc.corporateprofile.dto.Company;

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
	
	@Column(name = "created_by")
	private Integer created_by ;
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDateTime created_date;
	
	@Column(name = "modified_by")
	private Integer modified_by;
	
	@UpdateTimestamp
	@Column(name = "modified_date")
	private LocalDateTime modified_date;
	
	// Getters & Setters 
	
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

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public Integer getModified_by() {
		return modified_by;
	}

	public void setModified_by(Integer modified_by) {
		this.modified_by = modified_by;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date() {
		this.created_date = LocalDateTime.now();
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date() {
		this.modified_date = LocalDateTime.now();
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

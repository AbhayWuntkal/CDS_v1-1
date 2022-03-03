package com.abc.corporateprofile.travelpolicy.dto;

import java.time.LocalDateTime;

import javax.persistence.Basic;
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
public class Designations {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private Company company;

	@Column(name="designation_name")
	private String designation_name;
	
	@Column(name="designation_code")
	private String designation_code;
	
	@Column(name = "created_by")
	private Integer created_by;
	
	@CreationTimestamp
	@Basic(optional = false)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime created_date;
	
	@Column(name = "modified_by")
	private Integer modified_by;
	
	@UpdateTimestamp
	@Basic(optional = false)
	@Column(name = "modified_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private LocalDateTime modified_date;

	//Getters & Setters
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getDesignation_name() {
		return designation_name;
	}

	public void setDesignation_name(String designation_name) {
		this.designation_name = designation_name;
	}

	public String getDesignation_code() {
		return designation_code;
	}

	public void setDesignation_code(String designation_code) {
		this.designation_code = designation_code;
	}

	public Integer getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Integer created_by) {
		this.created_by = created_by;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public Integer getModified_by() {
		return modified_by;
	}

	public void setModified_by(Integer modified_by) {
		this.modified_by = modified_by;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date(LocalDateTime modified_date) {
		this.modified_date = modified_date;
	}

	@Override
	public String toString() {
		return "Designations [id=" + id + ", company=" + company + ", designation_name=" + designation_name
				+ ", designation_code=" + designation_code + ", created_by=" + created_by + ", created_date="
				+ created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date + ", getId()="
				+ getId() + ", getCompany()=" + getCompany() + ", getDesignation_name()=" + getDesignation_name()
				+ ", getDesignation_code()=" + getDesignation_code() + ", getCreated_by()=" + getCreated_by()
				+ ", getCreated_date()=" + getCreated_date() + ", getModified_by()=" + getModified_by()
				+ ", getModified_date()=" + getModified_date() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

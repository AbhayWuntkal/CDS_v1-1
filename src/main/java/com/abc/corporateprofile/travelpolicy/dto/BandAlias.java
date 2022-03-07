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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.abc.corporateprofile.dto.Company;

@Entity
@Table(name = "band_alias")
public class BandAlias {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@OneToOne(fetch= FetchType.EAGER)
	@JoinColumn
	private Company company;
	
	@Column(name="band_alias")
	private String band_alias;
	
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

	public String getBand_alias() {
		return band_alias;
	}

	public void setBand_alias(String band_alias) {
		this.band_alias = band_alias;
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
		return "Bands [id=" + id + ", company=" + company + ", band_alias=" + band_alias + ", created_by=" + created_by
				+ ", created_date=" + created_date + ", modified_by=" + modified_by + ", modified_date=" + modified_date
				+ ", getId()=" + getId() + ", getCompany()=" + getCompany() + ", getBand_alias()=" + getBand_alias()
				+ ", getCreated_by()=" + getCreated_by() + ", getCreated_date()=" + getCreated_date()
				+ ", getModified_by()=" + getModified_by() + ", getModified_date()=" + getModified_date()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

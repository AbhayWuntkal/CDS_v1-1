package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class State_master {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	@Column(name = "country_id")
	private String country_id;
	@Column(name = "state_id")
	private String state_id;
	@Column(name = "state_name")
	private String state_name;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "created_date")
	private String created_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "last_modified_date")
	private String last_modified_date;
	  
	@Column(name = "modified_by")
	private String modified_by;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCountry_id() {
		return country_id;
	}

	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}

	public String getState_id() {
		return state_id;
	}

	public void setState_id(String state_id) {
		this.state_id = state_id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
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
		return "State_master [id=" + id + ", country_id=" + country_id + ", state_id=" + state_id + ", state_name="
				+ state_name + ", created_date=" + created_date + ", last_modified_date=" + last_modified_date
				+ ", modified_by=" + modified_by + ", getId()=" + getId() + ", getCountry_id()=" + getCountry_id()
				+ ", getState_id()=" + getState_id() + ", getState_name()=" + getState_name() + ", getCreated_date()="
				+ getCreated_date() + ", getLast_modified_date()=" + getLast_modified_date() + ", getModified_by()="
				+ getModified_by() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}

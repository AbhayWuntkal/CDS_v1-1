package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer company_id;
	private String company_name;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	private String created_date;
	private Integer reg_number;
	
	
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
	public Integer getReg_number() {
		return reg_number;
	}
	public void setReg_number(Integer reg_number) {
		this.reg_number = reg_number;
	}
	@Override
	public String toString() {
		return "Company [company_id=" + company_id + ", company_name=" + company_name + ", created_date=" + created_date
				+ ", reg_number=" + reg_number + ", getCompany_id()=" + getCompany_id() + ", getCompany_name()="
				+ getCompany_name() + ", getCreated_date()=" + getCreated_date() + ", getReg_number()="
				+ getReg_number() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}

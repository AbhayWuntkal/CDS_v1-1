package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "Visa")
public class Visa {
	
	@Id
	@Column(name = "sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sno;
	
	@Column(name = "userid")
	private Integer userid;
	
	@Column(name = "visa_number")
	private Integer visa_number; 
	
	@Column(name = "issuing_country")
	private String issuing_country;
	
	@Column(name = "type_of_visa")
	private String type_of_visa;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "issue_date")
	private String issue_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "expiry_date")
	private String expiry_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "created_date")
	private String created_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "modified_date")
	private String modified_date;
	@Column(name = "modified_by")
	private String modified_by;
	@Column(name = "passport_link")
	private String passport_link;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
		this.sno = sno;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getVisa_number() {
		return visa_number;
	}
	public void setVisa_number(Integer visa_number) {
		this.visa_number = visa_number;
	}
	public String getIssuing_country() {
		return issuing_country;
	}
	public void setIssuing_country(String issuing_country) {
		this.issuing_country = issuing_country;
	}
	public String getType_of_visa() {
		return type_of_visa;
	}
	public void setType_of_visa(String type_of_visa) {
		this.type_of_visa = type_of_visa;
	}
	public String getIssue_date() {
		return issue_date;
	}
	public void setIssue_date(String issue_date) {
		this.issue_date = issue_date;
	}
	public String getExpiry_date() {
		return expiry_date;
	}
	public void setExpiry_date(String expiry_date) {
		this.expiry_date = expiry_date;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
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
	public String getPassport_link() {
		return passport_link;
	}
	public void setPassport_link(String passport_link) {
		this.passport_link = passport_link;
	}
	@Override
	public String toString() {
		return "Visa_master [sno=" + sno + ", userid=" + userid + ", visa_number=" + visa_number + ", issuing_country="
				+ issuing_country + ", type_of_visa=" + type_of_visa + ", issue_date=" + issue_date + ", expiry_date="
				+ expiry_date + ", created_date=" + created_date + ", modified_date=" + modified_date + ", modified_by="
				+ modified_by + ", passport_link=" + passport_link + ", getSno()=" + getSno() + ", getUserid()="
				+ getUserid() + ", getVisa_number()=" + getVisa_number() + ", getIssuing_country()="
				+ getIssuing_country() + ", getType_of_visa()=" + getType_of_visa() + ", getIssue_date()="
				+ getIssue_date() + ", getExpiry_date()=" + getExpiry_date() + ", getCreated_date()="
				+ getCreated_date() + ", getModified_date()=" + getModified_date() + ", getModified_by()="
				+ getModified_by() + ", getPassport_link()=" + getPassport_link() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}

package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
public class Passport {

	@Id
	@Column(name = "sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sno;
	
	@Column(name = "userid")
	private Integer userid;
	@Column(name = "issuing_country")
	private String issuing_country;
	
	@Column(name = "passport_number")
	private String passport_number;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "UTC")
	@Column(name = "birth_date")
	private String birth_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "issue_date")
	private String issue_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "expiry_date")
	private String expiry_date;
	@Column(name = "issuance_Place")
	private String issuance_Place;
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
	public String getIssuing_country() {
		return issuing_country;
	}
	public void setIssuing_country(String issuing_country) {
		this.issuing_country = issuing_country;
	}
	public String getPassport_number() {
		return passport_number;
	}
	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
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
	public String getIssuance_Place() {
		return issuance_Place;
	}
	public void setIssuance_Place(String issuance_Place) {
		this.issuance_Place = issuance_Place;
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
		return "Passport_master [sno=" + sno + ", userid=" + userid + ", issuing_country=" + issuing_country
				+ ", passport_number=" + passport_number + ", birth_date=" + birth_date + ", issue_date=" + issue_date
				+ ", expiry_date=" + expiry_date + ", issuance_Place=" + issuance_Place + ", created_date="
				+ created_date + ", modified_date=" + modified_date + ", modified_by=" + modified_by
				+ ", passport_link=" + passport_link + ", getSno()=" + getSno() + ", getUserid()=" + getUserid()
				+ ", getIssuing_country()=" + getIssuing_country() + ", getPassport_number()=" + getPassport_number()
				+ ", getBirth_date()=" + getBirth_date() + ", getIssue_date()=" + getIssue_date()
				+ ", getExpiry_date()=" + getExpiry_date() + ", getIssuance_Place()=" + getIssuance_Place()
				+ ", getCreated_date()=" + getCreated_date() + ", getModified_date()=" + getModified_date()
				+ ", getModified_by()=" + getModified_by() + ", getPassport_link()=" + getPassport_link()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

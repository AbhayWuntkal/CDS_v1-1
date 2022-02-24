package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Address_master {

	@Id
	@Column(name = "sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sno;
	
	@Column(name = "user_email")
	private String user_email ;
	
	@Column(name = "address_1")
	private String  address_1;
	
	@Column(name = "address_2")
	private String  address_2;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "postal")
	private String postal;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "address_type")
	private String address_type;
	
	@Column(name = "phone_type")
	private String phone_type;
	
	@Column(name = "phone_number")
	private String phone_number;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "UTC")
	@Column(name = "created_date")
	private String created_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "UTC")
	@Column(name = "modified_date")
	private String modified_date ;
	
	@Column(name = "modified_by")
	private String modified_by;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress_type() {
		return address_type;
	}

	public void setAddress_type(String address_type) {
		this.address_type = address_type;
	}

	public String getPhone_type() {
		return phone_type;
	}

	public void setPhone_type(String phone_type) {
		this.phone_type = phone_type;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
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

	@Override
	public String toString() {
		return "Address_master [sno=" + sno + ", user_email=" + user_email + ", address_1=" + address_1 + ", address_2="
				+ address_2 + ", city=" + city + ", postal=" + postal + ", state=" + state + ", country=" + country
				+ ", address_type=" + address_type + ", phone_type=" + phone_type + ", phone_number=" + phone_number
				+ ", created_date=" + created_date + ", modified_date=" + modified_date + ", modified_by=" + modified_by
				+ ", getSno()=" + getSno() + ", getUser_email()=" + getUser_email() + ", getAddress_1()="
				+ getAddress_1() + ", getAddress_2()=" + getAddress_2() + ", getCity()=" + getCity() + ", getPostal()="
				+ getPostal() + ", getState()=" + getState() + ", getCountry()=" + getCountry() + ", getAddress_type()="
				+ getAddress_type() + ", getPhone_type()=" + getPhone_type() + ", getPhone_number()="
				+ getPhone_number() + ", getCreated_date()=" + getCreated_date() + ", getModified_date()="
				+ getModified_date() + ", getModified_by()=" + getModified_by() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}


	
	
	

	
	
	
	
}

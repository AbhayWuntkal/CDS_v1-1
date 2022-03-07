package com.abc.corporateprofile.dto;

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

@Entity
public class GST_Details {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id ;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private User_Details user ;
	
	@Column(name = "gst_number")
	private String gst_number;
	
	@Column(name = "gst_email")
	private String gst_email ;
	
	@Column(name = "gst_holder_name")
	private String gst_holder_name ;
	
	@Column(name = "gst_phone_number")
	private String gst_phone_number ;
	
	@Column(name = "gst_address")
	private String gst_address ;
	
	@Column(name = "gst_state_code")
	private String gst_state_code ;
	
	@CreationTimestamp
	@Basic(optional = false)
	@Column(name = "created_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private LocalDateTime created_date;
	
	@UpdateTimestamp
	@Basic(optional = false)
	@Column(name = "modified_date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private LocalDateTime modified_date;
	
	@Column(name = "modified_by")
	private String modified_by;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public User_Details getUser() {
		return user;
	}

	public void setUser(User_Details user) {
		this.user = user;
	}

	public String getGst_number() {
		return gst_number;
	}

	public void setGst_number(String gst_number) {
		this.gst_number = gst_number;
	}

	public String getGst_email() {
		return gst_email;
	}

	public void setGst_email(String gst_email) {
		this.gst_email = gst_email;
	}

	public String getGst_holder_name() {
		return gst_holder_name;
	}

	public void setGst_holder_name(String gst_holder_name) {
		this.gst_holder_name = gst_holder_name;
	}

	public String getGst_phone_number() {
		return gst_phone_number;
	}

	public void setGst_phone_number(String gst_phone_number) {
		this.gst_phone_number = gst_phone_number;
	}

	public String getGst_address() {
		return gst_address;
	}

	public void setGst_address(String gst_address) {
		this.gst_address = gst_address;
	}

	public String getGst_state_code() {
		return gst_state_code;
	}

	public void setGst_state_code(String gst_state_code) {
		this.gst_state_code = gst_state_code;
	}

	public LocalDateTime getCreated_date() {
		return created_date;
	}

	public void setCreated_date(LocalDateTime created_date) {
		this.created_date = created_date;
	}

	public LocalDateTime getModified_date() {
		return modified_date;
	}

	public void setModified_date(LocalDateTime modified_date) {
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
		return "GST_Details [id=" + id + ", user=" + user + ", gst_number=" + gst_number + ", gst_email=" + gst_email
				+ ", gst_holder_name=" + gst_holder_name + ", gst_phone_number=" + gst_phone_number + ", gst_address="
				+ gst_address + ", gst_state_code=" + gst_state_code + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + ", modified_by=" + modified_by + ", getId()=" + getId()
				+ ", getUser()=" + getUser() + ", getGst_number()=" + getGst_number() + ", getGst_email()="
				+ getGst_email() + ", getGst_holder_name()=" + getGst_holder_name() + ", getGst_phone_number()="
				+ getGst_phone_number() + ", getGst_address()=" + getGst_address() + ", getGst_state_code()="
				+ getGst_state_code() + ", getCreated_date()=" + getCreated_date() + ", getModified_date()="
				+ getModified_date() + ", getModified_by()=" + getModified_by() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

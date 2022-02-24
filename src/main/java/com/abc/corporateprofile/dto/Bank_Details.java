package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Bank_Details {
	
	@Id
	@Column(name = "sr_no")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sr_no;
	
	@Column(name = "branchid")
	private Integer branchid ;
	
	@Column(name = "userid")
	private Integer userid ;
	
	@Column(name = "bank_name")
	private String bank_name ;
	
	@Column(name = "bank_branch")
	private String bank_branch ;
	
	@Column(name = "account_no")
	private String account_no ;
	
	@Column(name = "ifsc_code")
	private String ifsc_code ;
	
	@Column(name = "swift_code")
	private String swift_code ;
	
	@Column(name = "created_by")
	private String created_by ;

	@Column(name = "modified_by")
	private String modified_by;
	
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	 @Column(name = "created_date")
	 private String created_date ;
	 
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	 @Column(name = "modified_date")
	 private String modified_date ;

	public Integer getSr_no() {
		return sr_no;
	}

	public void setSr_no(Integer sr_no) {
		this.sr_no = sr_no;
	}

	public Integer getBranchid() {
		return branchid;
	}

	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getBank_branch() {
		return bank_branch;
	}

	public void setBank_branch(String bank_branch) {
		this.bank_branch = bank_branch;
	}

	public String getAccount_no() {
		return account_no;
	}

	public void setAccount_no(String account_no) {
		this.account_no = account_no;
	}

	public String getIfsc_code() {
		return ifsc_code;
	}

	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getSwift_code() {
		return swift_code;
	}

	public void setSwift_code(String swift_code) {
		this.swift_code = swift_code;
	}

	public String getCreated_by() {
		return created_by;
	}

	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}

	public String getModified_by() {
		return modified_by;
	}

	public void setModified_by(String modified_by) {
		this.modified_by = modified_by;
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

	@Override
	public String toString() {
		return "Bank_Details [sr_no=" + sr_no + ", branchid=" + branchid + ", userid=" + userid + ", bank_name="
				+ bank_name + ", bank_branch=" + bank_branch + ", account_no=" + account_no + ", ifsc_code=" + ifsc_code
				+ ", swift_code=" + swift_code + ", created_by=" + created_by + ", modified_by=" + modified_by
				+ ", created_date=" + created_date + ", modified_date=" + modified_date + ", getSr_no()=" + getSr_no()
				+ ", getBranchid()=" + getBranchid() + ", getUserid()=" + getUserid() + ", getBank_name()="
				+ getBank_name() + ", getBank_branch()=" + getBank_branch() + ", getAccount_no()=" + getAccount_no()
				+ ", getIfsc_code()=" + getIfsc_code() + ", getSwift_code()=" + getSwift_code() + ", getCreated_by()="
				+ getCreated_by() + ", getModified_by()=" + getModified_by() + ", getCreated_date()="
				+ getCreated_date() + ", getModified_date()=" + getModified_date() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

		 

}

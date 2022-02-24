package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class lnk_user_role {

	@Id
	@Column(name = "userid")
	private Integer  userid;
	
	@Column(name = "roleid")
	private Integer  roleid;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "created_date")
	private String created_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "last_modified_date")
	private String last_modified_date;
	
	@Column(name = "modified_by")
	private String modified_by;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
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
		return "lnk_user_role [userid=" + userid + ", roleid=" + roleid + ", created_date=" + created_date
				+ ", last_modified_date=" + last_modified_date + ", modified_by=" + modified_by + ", getUserid()="
				+ getUserid() + ", getRoleid()=" + getRoleid() + ", getCreated_date()=" + getCreated_date()
				+ ", getLast_modified_date()=" + getLast_modified_date() + ", getModified_by()=" + getModified_by()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}

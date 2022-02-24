package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Insurance {

	@Id
	@Column(name = "sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sno;
	
	@Column(name = "userid")
	private Integer userid;
	
	@Column(name = "insurer")
	private String insurer;
	
	@Column(name = "region")
	private String region;
	
	@Column(name = "policy_no")
	private Integer policy_no;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "UTC")
	@Column(name = "start_date")
	private String start_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd", timezone = "UTC")
	@Column(name = "end_date")
	private String end_date;
	
	@Column(name = "nominee")
	private String nominee;

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

	public String getInsurer() {
		return insurer;
	}

	public void setInsurer(String insurer) {
		this.insurer = insurer;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Integer getPolicy_no() {
		return policy_no;
	}

	public void setPolicy_no(Integer policy_no) {
		this.policy_no = policy_no;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	@Override
	public String toString() {
		return "Insurance [sno=" + sno + ", userid=" + userid + ", insurer=" + insurer + ", region=" + region
				+ ", policy_no=" + policy_no + ", start_date=" + start_date + ", end_date=" + end_date + ", nominee="
				+ nominee + ", getSno()=" + getSno() + ", getUserid()=" + getUserid() + ", getInsurer()=" + getInsurer()
				+ ", getRegion()=" + getRegion() + ", getPolicy_no()=" + getPolicy_no() + ", getStart_date()="
				+ getStart_date() + ", getEnd_date()=" + getEnd_date() + ", getNominee()=" + getNominee()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}

package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Organizational_Details {
	
	@Id
	@Column(name = "sno")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sno ;
	
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "employee_code")
	private String employee_code  ;
	
	@Column(name = "designation")
	private String designation  ;
	
	@Column(name = "band")
	private String band  ;
	
	@Column(name = "location")
	private String location  ;
	
	@Column(name = "department")
	private String department ;
	
	@Column(name = "meta_info2")
	private String meta_info2  ;
	
	@Column(name = "domestic_eligibility")
	private String domestic_eligibility  ;
	
	@Column(name = "international_eligibility")
	private String international_eligibility ;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "date_of_joining")
	private String  date_of_joining ;
	 
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	 @Column(name = "date_of_termination")
	 private String  date_of_termination ;
	 
	 @Column(name = "is_approver")
	 private boolean is_approver = false;
	 
	 @Column(name = "approver_credit_limit")
	 private Integer approver_credit_limit ;
	 
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	 @Column(name = "created_date")
	 private String created_date  ;
	 
	 @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	 @Column(name = "modified_date")
	 private String modified_date  ;
	 
	 @Column(name = "modified_by")
	 private String modified_by ;
	 
	 @Column(name = "cost_center")
	 private String cost_center  ;
	 
	 @Column(name = "project_code")
	 private String project_code ;

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmployee_code() {
		return employee_code;
	}

	public void setEmployee_code(String employee_code) {
		this.employee_code = employee_code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getMeta_info2() {
		return meta_info2;
	}

	public void setMeta_info2(String meta_info2) {
		this.meta_info2 = meta_info2;
	}

	public String getDomestic_eligibility() {
		return domestic_eligibility;
	}

	public void setDomestic_eligibility(String domestic_eligibility) {
		this.domestic_eligibility = domestic_eligibility;
	}

	public String getInternational_eligibility() {
		return international_eligibility;
	}

	public void setInternational_eligibility(String international_eligibility) {
		this.international_eligibility = international_eligibility;
	}

	public String getDate_of_joining() {
		return date_of_joining;
	}

	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}

	public String getDate_of_termination() {
		return date_of_termination;
	}

	public void setDate_of_termination(String date_of_termination) {
		this.date_of_termination = date_of_termination;
	}

	public boolean isIs_approver() {
		return is_approver;
	}

	public void setIs_approver(boolean is_approver) {
		this.is_approver = is_approver;
	}

	public Integer getApprover_credit_limit() {
		return approver_credit_limit;
	}

	public void setApprover_credit_limit(Integer approver_credit_limit) {
		this.approver_credit_limit = approver_credit_limit;
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

	public String getCost_center() {
		return cost_center;
	}

	public void setCost_center(String cost_center) {
		this.cost_center = cost_center;
	}

	public String getProject_code() {
		return project_code;
	}

	public void setProject_code(String project_code) {
		this.project_code = project_code;
	}

	@Override
	public String toString() {
		return "Organizational_Details [sno=" + sno + ", id=" + id + ", employee_code=" + employee_code
				+ ", designation=" + designation + ", band=" + band + ", location=" + location + ", department="
				+ department + ", meta_info2=" + meta_info2 + ", domestic_eligibility=" + domestic_eligibility
				+ ", international_eligibility=" + international_eligibility + ", date_of_joining=" + date_of_joining
				+ ", date_of_termination=" + date_of_termination + ", is_approver=" + is_approver
				+ ", approver_credit_limit=" + approver_credit_limit + ", created_date=" + created_date
				+ ", modified_date=" + modified_date + ", modified_by=" + modified_by + ", cost_center=" + cost_center
				+ ", project_code=" + project_code + ", getSno()=" + getSno() + ", getId()=" + getId()
				+ ", getEmployee_code()=" + getEmployee_code() + ", getDesignation()=" + getDesignation()
				+ ", getBand()=" + getBand() + ", getLocation()=" + getLocation() + ", getDepartment()="
				+ getDepartment() + ", getMeta_info2()=" + getMeta_info2() + ", getDomestic_eligibility()="
				+ getDomestic_eligibility() + ", getInternational_eligibility()=" + getInternational_eligibility()
				+ ", getDate_of_joining()=" + getDate_of_joining() + ", getDate_of_termination()="
				+ getDate_of_termination() + ", isIs_approver()=" + isIs_approver() + ", getApprover_credit_limit()="
				+ getApprover_credit_limit() + ", getCreated_date()=" + getCreated_date() + ", getModified_date()="
				+ getModified_date() + ", getModified_by()=" + getModified_by() + ", getCost_center()="
				+ getCost_center() + ", getProject_code()=" + getProject_code() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	

	 

}

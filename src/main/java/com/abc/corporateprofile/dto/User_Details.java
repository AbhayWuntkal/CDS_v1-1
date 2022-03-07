package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class User_Details {

	@Id
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer userid  ;
	
	private Integer company_id;
	@Column(name="company_branchid")
	private Integer company_branchid ;
	@Column(name="user_type")
	private String user_type ;
	@Column(unique = true,name="email_id")
	private String email_id ;
	@Column(name="title")
	private String title;
	@Column(name="fname")
	private String fname;
	@Column(name="last_name")
	private String last_name;
	@Column(name="password")
	private String password;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="security_stamp")
	private String security_stamp;
	
	@Column(name="phone_number")
	private String phone_number;
	
	@Column(name="two_factor_enabled")
	private boolean two_factor_enabled = false;
	
	@Column(name="is_flight_approver_group")
	private boolean is_flight_approver_group = false;
	@Column(name="is_flight_arranger_group")
	private boolean is_flight_arranger_group = false;
	@Column(name="is_flight_travel_arranger")
	private boolean is_flight_travel_arranger = false;
	@Column(name="lockout_enabled")
	private boolean lockout_enabled = false;
	@Column(name="accessfailed_count")
	private Integer accessfailed_count;
	@Column(name="email_confirmed")
	private boolean email_confirmed = false;
	@Column(name="phone_number_confirmed")
	private boolean phone_number_confirmed = false;
	@Column(name="status")
	private String status;
	@Column(name="pan_name")
	private String pan_name;
	@Column(name="pan_number")
	private String pan_number;
	@Column(name="user_deposit")
	private Integer user_deposit;
	@Column(name="user_deposit_limit")
	private Integer user_deposit_limit;
	@Column(name="user_credit")
	private Integer user_credit;
	@Column(name="user_credit_limit")
	private Integer user_credit_limit;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "contract_expiry_date")
	private String contract_expiry_date ;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "created_date")
	private String  created_date ;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "last_modified_date")
	private String last_modified_date;
	
	@Column(name="modified_by")
    private String modified_by;
    
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "last_transac_date")
    private String last_transac_date ;
	
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "last_login_date")
    private String last_login_date;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "activation_date")
    private String activation_date ;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "deactivation_date")
    private String deactivation_date ;
	
	@Column(name="account_code")
	private String account_code;
	@Column(name="approver1")
	private String approver1;
	@Column(name="approver2")
	private String approver2;
	@Column(name="approvel_type")
	private String approvel_type;
	@Column(name="trip_approvel_type")
	private boolean trip_approvel_type = false;
	@Column(name="sex")
	private String sex;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "dob")
	private String dob  ;
	
	@Column(name="nationality")
	private String nationality;
	@Column(name="profile_type")
	private String profile_type;
	@Column(name="residency")
	private String residency;
	@Column(name="iscorp")
	private boolean iscorp = false;
	@Column(name="is_meal")
	private boolean is_meal = false;
	@Column(name="is_baggage")
	private boolean is_baggage = false;
	@Column(name="is_hold_booking")
	private boolean is_hold_booking = false;
	@Column(name="is_approver")
	private boolean is_approver = false;
	@Column(name="is_travel_arranger")
	private boolean is_travel_arranger = false;
	@Column(name="approver_group")
	private Integer approver_group;
	@Column(name="travel_arranger_group")
	private Integer travel_arranger_group;
	@Column(name="device_token")
    private String device_token;
	@Column(name="htl_approver_group")
    private Integer htl_approver_group;
	@Column(name="htl_travel_arranger_group")
    private Integer htl_travel_arranger_group;
	@Column(name="is_trip_claim_approver")
    private boolean is_trip_claim_approver = false;
	@Column(name="claim_approver_group")
    private Integer claim_approver_group;
	@Column(name="is_queue_booking")
    private boolean is_queue_booking = false;
	@Column(name="is_single_paxbooking")
    private boolean is_single_paxbooking = false;
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Integer company_id) {
		this.company_id = company_id;
	}
	public Integer getCompany_branchid() {
		return company_branchid;
	}
	public void setCompany_branchid(Integer company_branchid) {
		this.company_branchid = company_branchid;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSecurity_stamp() {
		return security_stamp;
	}
	public void setSecurity_stamp(String security_stamp) {
		this.security_stamp = security_stamp;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public boolean isTwo_factor_enabled() {
		return two_factor_enabled;
	}
	public void setTwo_factor_enabled(boolean two_factor_enabled) {
		this.two_factor_enabled = two_factor_enabled;
	}
	public boolean isIs_flight_approver_group() {
		return is_flight_approver_group;
	}
	public void setIs_flight_approver_group(boolean is_flight_approver_group) {
		this.is_flight_approver_group = is_flight_approver_group;
	}
	public boolean isIs_flight_arranger_group() {
		return is_flight_arranger_group;
	}
	public void setIs_flight_arranger_group(boolean is_flight_arranger_group) {
		this.is_flight_arranger_group = is_flight_arranger_group;
	}
	public boolean isIs_flight_travel_arranger() {
		return is_flight_travel_arranger;
	}
	public void setIs_flight_travel_arranger(boolean is_flight_travel_arranger) {
		this.is_flight_travel_arranger = is_flight_travel_arranger;
	}
	public boolean isLockout_enabled() {
		return lockout_enabled;
	}
	public void setLockout_enabled(boolean lockout_enabled) {
		this.lockout_enabled = lockout_enabled;
	}
	public Integer getAccessfailed_count() {
		return accessfailed_count;
	}
	public void setAccessfailed_count(Integer accessfailed_count) {
		this.accessfailed_count = accessfailed_count;
	}
	public boolean isEmail_confirmed() {
		return email_confirmed;
	}
	public void setEmail_confirmed(boolean email_confirmed) {
		this.email_confirmed = email_confirmed;
	}
	public boolean isPhone_number_confirmed() {
		return phone_number_confirmed;
	}
	public void setPhone_number_confirmed(boolean phone_number_confirmed) {
		this.phone_number_confirmed = phone_number_confirmed;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPan_name() {
		return pan_name;
	}
	public void setPan_name(String pan_name) {
		this.pan_name = pan_name;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public Integer getUser_deposit() {
		return user_deposit;
	}
	public void setUser_deposit(Integer user_deposit) {
		this.user_deposit = user_deposit;
	}
	public Integer getUser_deposit_limit() {
		return user_deposit_limit;
	}
	public void setUser_deposit_limit(Integer user_deposit_limit) {
		this.user_deposit_limit = user_deposit_limit;
	}
	public Integer getUser_credit() {
		return user_credit;
	}
	public void setUser_credit(Integer user_credit) {
		this.user_credit = user_credit;
	}
	public Integer getUser_credit_limit() {
		return user_credit_limit;
	}
	public void setUser_credit_limit(Integer user_credit_limit) {
		this.user_credit_limit = user_credit_limit;
	}
	public String getContract_expiry_date() {
		return contract_expiry_date;
	}
	public void setContract_expiry_date(String contract_expiry_date) {
		this.contract_expiry_date = contract_expiry_date;
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
	public String getLast_transac_date() {
		return last_transac_date;
	}
	public void setLast_transac_date(String last_transac_date) {
		this.last_transac_date = last_transac_date;
	}
	public String getLast_login_date() {
		return last_login_date;
	}
	public void setLast_login_date(String last_login_date) {
		this.last_login_date = last_login_date;
	}
	public String getActivation_date() {
		return activation_date;
	}
	public void setActivation_date(String activation_date) {
		this.activation_date = activation_date;
	}
	public String getDeactivation_date() {
		return deactivation_date;
	}
	public void setDeactivation_date(String deactivation_date) {
		this.deactivation_date = deactivation_date;
	}
	public String getAccount_code() {
		return account_code;
	}
	public void setAccount_code(String account_code) {
		this.account_code = account_code;
	}
	public String getApprover1() {
		return approver1;
	}
	public void setApprover1(String approver1) {
		this.approver1 = approver1;
	}
	public String getApprover2() {
		return approver2;
	}
	public void setApprover2(String approver2) {
		this.approver2 = approver2;
	}
	public String getApprovel_type() {
		return approvel_type;
	}
	public void setApprovel_type(String approvel_type) {
		this.approvel_type = approvel_type;
	}
	public boolean isTrip_approvel_type() {
		return trip_approvel_type;
	}
	public void setTrip_approvel_type(boolean trip_approvel_type) {
		this.trip_approvel_type = trip_approvel_type;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getProfile_type() {
		return profile_type;
	}
	public void setProfile_type(String profile_type) {
		this.profile_type = profile_type;
	}
	public String getResidency() {
		return residency;
	}
	public void setResidency(String residency) {
		this.residency = residency;
	}
	public boolean isIscorp() {
		return iscorp;
	}
	public void setIscorp(boolean iscorp) {
		this.iscorp = iscorp;
	}
	public boolean isIs_meal() {
		return is_meal;
	}
	public void setIs_meal(boolean is_meal) {
		this.is_meal = is_meal;
	}
	public boolean isIs_baggage() {
		return is_baggage;
	}
	public void setIs_baggage(boolean is_baggage) {
		this.is_baggage = is_baggage;
	}
	public boolean isIs_hold_booking() {
		return is_hold_booking;
	}
	public void setIs_hold_booking(boolean is_hold_booking) {
		this.is_hold_booking = is_hold_booking;
	}
	public boolean isIs_approver() {
		return is_approver;
	}
	public void setIs_approver(boolean is_approver) {
		this.is_approver = is_approver;
	}
	public boolean isIs_travel_arranger() {
		return is_travel_arranger;
	}
	public void setIs_travel_arranger(boolean is_travel_arranger) {
		this.is_travel_arranger = is_travel_arranger;
	}
	public Integer getApprover_group() {
		return approver_group;
	}
	public void setApprover_group(Integer approver_group) {
		this.approver_group = approver_group;
	}
	public Integer getTravel_arranger_group() {
		return travel_arranger_group;
	}
	public void setTravel_arranger_group(Integer travel_arranger_group) {
		this.travel_arranger_group = travel_arranger_group;
	}
	public String getDevice_token() {
		return device_token;
	}
	public void setDevice_token(String device_token) {
		this.device_token = device_token;
	}
	public Integer getHtl_approver_group() {
		return htl_approver_group;
	}
	public void setHtl_approver_group(Integer htl_approver_group) {
		this.htl_approver_group = htl_approver_group;
	}
	public Integer getHtl_travel_arranger_group() {
		return htl_travel_arranger_group;
	}
	public void setHtl_travel_arranger_group(Integer htl_travel_arranger_group) {
		this.htl_travel_arranger_group = htl_travel_arranger_group;
	}
	public boolean isIs_trip_claim_approver() {
		return is_trip_claim_approver;
	}
	public void setIs_trip_claim_approver(boolean is_trip_claim_approver) {
		this.is_trip_claim_approver = is_trip_claim_approver;
	}
	public Integer getClaim_approver_group() {
		return claim_approver_group;
	}
	public void setClaim_approver_group(Integer claim_approver_group) {
		this.claim_approver_group = claim_approver_group;
	}
	public boolean isIs_queue_booking() {
		return is_queue_booking;
	}
	public void setIs_queue_booking(boolean is_queue_booking) {
		this.is_queue_booking = is_queue_booking;
	}
	public boolean isIs_single_paxbooking() {
		return is_single_paxbooking;
	}
	public void setIs_single_paxbooking(boolean is_single_paxbooking) {
		this.is_single_paxbooking = is_single_paxbooking;
	}
	@Override
	public String toString() {
		return "User_Details [userid=" + userid + ", company_id=" + company_id + ", company_branchid="
				+ company_branchid + ", user_type=" + user_type + ", email_id=" + email_id + ", title=" + title
				+ ", fname=" + fname + ", last_name=" + last_name + ", password=" + password + ", gender=" + gender
				+ ", security_stamp=" + security_stamp + ", phone_number=" + phone_number + ", two_factor_enabled="
				+ two_factor_enabled + ", is_flight_approver_group=" + is_flight_approver_group
				+ ", is_flight_arranger_group=" + is_flight_arranger_group + ", is_flight_travel_arranger="
				+ is_flight_travel_arranger + ", lockout_enabled=" + lockout_enabled + ", accessfailed_count="
				+ accessfailed_count + ", email_confirmed=" + email_confirmed + ", phone_number_confirmed="
				+ phone_number_confirmed + ", status=" + status + ", pan_name=" + pan_name + ", pan_number="
				+ pan_number + ", user_deposit=" + user_deposit + ", user_deposit_limit=" + user_deposit_limit
				+ ", user_credit=" + user_credit + ", user_credit_limit=" + user_credit_limit
				+ ", contract_expiry_date=" + contract_expiry_date + ", created_date=" + created_date
				+ ", last_modified_date=" + last_modified_date + ", modified_by=" + modified_by + ", last_transac_date="
				+ last_transac_date + ", last_login_date=" + last_login_date + ", activation_date=" + activation_date
				+ ", deactivation_date=" + deactivation_date + ", account_code=" + account_code + ", approver1="
				+ approver1 + ", approver2=" + approver2 + ", approvel_type=" + approvel_type + ", trip_approvel_type="
				+ trip_approvel_type + ", sex=" + sex + ", dob=" + dob + ", nationality=" + nationality
				+ ", profile_type=" + profile_type + ", residency=" + residency + ", iscorp=" + iscorp + ", is_meal="
				+ is_meal + ", is_baggage=" + is_baggage + ", is_hold_booking=" + is_hold_booking + ", is_approver="
				+ is_approver + ", is_travel_arranger=" + is_travel_arranger + ", approver_group=" + approver_group
				+ ", travel_arranger_group=" + travel_arranger_group + ", device_token=" + device_token
				+ ", htl_approver_group=" + htl_approver_group + ", htl_travel_arranger_group="
				+ htl_travel_arranger_group + ", is_trip_claim_approver=" + is_trip_claim_approver
				+ ", claim_approver_group=" + claim_approver_group + ", is_queue_booking=" + is_queue_booking
				+ ", is_single_paxbooking=" + is_single_paxbooking + ", getUserid()=" + getUserid()
				+ ", getCompany_id()=" + getCompany_id() + ", getCompany_branchid()=" + getCompany_branchid()
				+ ", getUser_type()=" + getUser_type() + ", getEmail_id()=" + getEmail_id() + ", getTitle()="
				+ getTitle() + ", getFname()=" + getFname() + ", getLast_name()=" + getLast_name() + ", getPassword()="
				+ getPassword() + ", getGender()=" + getGender() + ", getSecurity_stamp()=" + getSecurity_stamp()
				+ ", getPhone_number()=" + getPhone_number() + ", isTwo_factor_enabled()=" + isTwo_factor_enabled()
				+ ", isIs_flight_approver_group()=" + isIs_flight_approver_group() + ", isIs_flight_arranger_group()="
				+ isIs_flight_arranger_group() + ", isIs_flight_travel_arranger()=" + isIs_flight_travel_arranger()
				+ ", isLockout_enabled()=" + isLockout_enabled() + ", getAccessfailed_count()="
				+ getAccessfailed_count() + ", isEmail_confirmed()=" + isEmail_confirmed()
				+ ", isPhone_number_confirmed()=" + isPhone_number_confirmed() + ", getStatus()=" + getStatus()
				+ ", getPan_name()=" + getPan_name() + ", getPan_number()=" + getPan_number() + ", getUser_deposit()="
				+ getUser_deposit() + ", getUser_deposit_limit()=" + getUser_deposit_limit() + ", getUser_credit()="
				+ getUser_credit() + ", getUser_credit_limit()=" + getUser_credit_limit()
				+ ", getContract_expiry_date()=" + getContract_expiry_date() + ", getCreated_date()="
				+ getCreated_date() + ", getLast_modified_date()=" + getLast_modified_date() + ", getModified_by()="
				+ getModified_by() + ", getLast_transac_date()=" + getLast_transac_date() + ", getLast_login_date()="
				+ getLast_login_date() + ", getActivation_date()=" + getActivation_date() + ", getDeactivation_date()="
				+ getDeactivation_date() + ", getAccount_code()=" + getAccount_code() + ", getApprover1()="
				+ getApprover1() + ", getApprover2()=" + getApprover2() + ", getApprovel_type()=" + getApprovel_type()
				+ ", isTrip_approvel_type()=" + isTrip_approvel_type() + ", getSex()=" + getSex() + ", getDob()="
				+ getDob() + ", getNationality()=" + getNationality() + ", getProfile_type()=" + getProfile_type()
				+ ", getResidency()=" + getResidency() + ", isIscorp()=" + isIscorp() + ", isIs_meal()=" + isIs_meal()
				+ ", isIs_baggage()=" + isIs_baggage() + ", isIs_hold_booking()=" + isIs_hold_booking()
				+ ", isIs_approver()=" + isIs_approver() + ", isIs_travel_arranger()=" + isIs_travel_arranger()
				+ ", getApprover_group()=" + getApprover_group() + ", getTravel_arranger_group()="
				+ getTravel_arranger_group() + ", getDevice_token()=" + getDevice_token() + ", getHtl_approver_group()="
				+ getHtl_approver_group() + ", getHtl_travel_arranger_group()=" + getHtl_travel_arranger_group()
				+ ", isIs_trip_claim_approver()=" + isIs_trip_claim_approver() + ", getClaim_approver_group()="
				+ getClaim_approver_group() + ", isIs_queue_booking()=" + isIs_queue_booking()
				+ ", isIs_single_paxbooking()=" + isIs_single_paxbooking() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}

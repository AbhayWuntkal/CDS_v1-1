package com.abc.corporateprofile.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Companybranch {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "parent")
	private Integer parent;
	
	@Column(name = "hierarchical_level")
	private Integer hierarchical_level;
	@Column(name = "type")
	private String type;
	@Column(name = "status")
	private String status;
	
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "created_date")
	private String created_date;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy", timezone = "UTC")
	@Column(name = "last_modified_date")
	private String last_modified_date;
	  
	  
	@Column(name = "modified_by")
	private String modified_by;
	@Column(name = "logo_url")
	private String logo_url;
	@Column(name = "industry_type")
	private String industry_type;
	
	@Column(name = "account_type")
	private String account_type;
	
	@Column(name = "max_limit")
	private Integer max_limit;
	@Column(name = "available_balance")
	private Integer available_balance;
	@Column(name = "c_gst")
	private Integer c_gst;
	@Column(name = "s_gst")
	private Integer s_gst;
	  
	@Column(name = "travel_policy")
	private String travel_policy;
	@Column(name = "is_auto_nvoicing")
	private Boolean is_auto_nvoicing = false;
	  
	@Column(name = "invoicing_package_name")
	private String invoicing_package_name;
	@Column(name = "plan_Type")
	private String plan_Type;
	@Column(name = "booking_prefix")
	private String booking_prefix;
	@Column(name = "invoicing_prefix")
	private String invoicing_prefix;
	@Column(name = "invoicing_template")
	private String invoicing_template;
	@Column(name = "cin_number")
	private String cin_number;
	@Column(name = "signature")
	private String signature;
	@Column(name = "pan_number")
	private String pan_number;
	@Column(name = "hsn_sac_code")
	private String hsn_sac_code;
	@Column(name = "is_protect")
	private Boolean is_protect = false;
	  
	@Column(name = "dasboard_banner")
	private String dasboard_banner;
	@Column(name = "protect_amount")
	private Integer protect_amount;
	@Column(name = "exclude_airline")
	private String exclude_airline;
	@Column(name = "show_deposite")
	private Boolean show_deposite = false;
	@Column(name = "show_fare_rule")
	private Boolean show_fare_rule = false;
	@Column(name = "fare_rule_airlines")
	private String fare_rule_airlines;
	@Column(name = "hide_ticket_fare")
	private Boolean hide_ticket_fare = false;
	@Column(name = "hide_fare_type")
	private Boolean hide_fare_type = false;
	@Column(name = "hide_promo_code")
	private  Boolean hide_promo_code = false;
	@Column(name = "hide_cost_center")
	private  Boolean hide_cost_center = false;
	@Column(name = "hide_project_code")
	private  Boolean hide_project_code = false;
	@Column(name = "hide_department")
	private  Boolean hide_department = false;
	@Column(name = "hide_location")
	private  Boolean hide_location = false;
	@Column(name = "hide_employee_id")
	private Boolean hide_employee_id = false;
	@Column(name = "hide_booking_by")
	private  Boolean hide_booking_by = false;
	@Column(name = "hide_trf")
	private  Boolean hide_trf = false;
	@Column(name = "hide_all_pax_contact")
	private  Boolean hide_all_pax_contact = false;
	@Column(name = "gst_details")
	private String gst_details;
	@Column(name = "service_class")
	private  Boolean service_class = false;
	@Column(name = "show_contact_address")
	private  Boolean show_contact_address = false;
	@Column(name = "show_paid_seat")
	private  Boolean show_paid_seat = false;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getParent() {
		return parent;
	}
	public void setParent(Integer parent) {
		this.parent = parent;
	}
	public Integer getHierarchical_level() {
		return hierarchical_level;
	}
	public void setHierarchical_level(Integer hierarchical_level) {
		this.hierarchical_level = hierarchical_level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public String getLogo_url() {
		return logo_url;
	}
	public void setLogo_url(String logo_url) {
		this.logo_url = logo_url;
	}
	public String getIndustry_type() {
		return industry_type;
	}
	public void setIndustry_type(String industry_type) {
		this.industry_type = industry_type;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public Integer getMax_limit() {
		return max_limit;
	}
	public void setMax_limit(Integer max_limit) {
		this.max_limit = max_limit;
	}
	public Integer getAvailable_balance() {
		return available_balance;
	}
	public void setAvailable_balance(Integer available_balance) {
		this.available_balance = available_balance;
	}
	public Integer getC_gst() {
		return c_gst;
	}
	public void setC_gst(Integer c_gst) {
		this.c_gst = c_gst;
	}
	public Integer getS_gst() {
		return s_gst;
	}
	public void setS_gst(Integer s_gst) {
		this.s_gst = s_gst;
	}
	public String getTravel_policy() {
		return travel_policy;
	}
	public void setTravel_policy(String travel_policy) {
		this.travel_policy = travel_policy;
	}
	public Boolean getIs_auto_nvoicing() {
		return is_auto_nvoicing;
	}
	public void setIs_auto_nvoicing(Boolean is_auto_nvoicing) {
		this.is_auto_nvoicing = is_auto_nvoicing;
	}
	public String getInvoicing_package_name() {
		return invoicing_package_name;
	}
	public void setInvoicing_package_name(String invoicing_package_name) {
		this.invoicing_package_name = invoicing_package_name;
	}
	public String getPlan_Type() {
		return plan_Type;
	}
	public void setPlan_Type(String plan_Type) {
		this.plan_Type = plan_Type;
	}
	public String getBooking_prefix() {
		return booking_prefix;
	}
	public void setBooking_prefix(String booking_prefix) {
		this.booking_prefix = booking_prefix;
	}
	public String getInvoicing_prefix() {
		return invoicing_prefix;
	}
	public void setInvoicing_prefix(String invoicing_prefix) {
		this.invoicing_prefix = invoicing_prefix;
	}
	public String getInvoicing_template() {
		return invoicing_template;
	}
	public void setInvoicing_template(String invoicing_template) {
		this.invoicing_template = invoicing_template;
	}
	public String getCin_number() {
		return cin_number;
	}
	public void setCin_number(String cin_number) {
		this.cin_number = cin_number;
	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getPan_number() {
		return pan_number;
	}
	public void setPan_number(String pan_number) {
		this.pan_number = pan_number;
	}
	public String getHsn_sac_code() {
		return hsn_sac_code;
	}
	public void setHsn_sac_code(String hsn_sac_code) {
		this.hsn_sac_code = hsn_sac_code;
	}
	public Boolean getIs_protect() {
		return is_protect;
	}
	public void setIs_protect(Boolean is_protect) {
		this.is_protect = is_protect;
	}
	public String getDasboard_banner() {
		return dasboard_banner;
	}
	public void setDasboard_banner(String dasboard_banner) {
		this.dasboard_banner = dasboard_banner;
	}
	public Integer getProtect_amount() {
		return protect_amount;
	}
	public void setProtect_amount(Integer protect_amount) {
		this.protect_amount = protect_amount;
	}
	public String getExclude_airline() {
		return exclude_airline;
	}
	public void setExclude_airline(String exclude_airline) {
		this.exclude_airline = exclude_airline;
	}
	public Boolean getShow_deposite() {
		return show_deposite;
	}
	public void setShow_deposite(Boolean show_deposite) {
		this.show_deposite = show_deposite;
	}
	public Boolean getShow_fare_rule() {
		return show_fare_rule;
	}
	public void setShow_fare_rule(Boolean show_fare_rule) {
		this.show_fare_rule = show_fare_rule;
	}
	public String getFare_rule_airlines() {
		return fare_rule_airlines;
	}
	public void setFare_rule_airlines(String fare_rule_airlines) {
		this.fare_rule_airlines = fare_rule_airlines;
	}
	public Boolean getHide_ticket_fare() {
		return hide_ticket_fare;
	}
	public void setHide_ticket_fare(Boolean hide_ticket_fare) {
		this.hide_ticket_fare = hide_ticket_fare;
	}
	public Boolean getHide_fare_type() {
		return hide_fare_type;
	}
	public void setHide_fare_type(Boolean hide_fare_type) {
		this.hide_fare_type = hide_fare_type;
	}
	public Boolean getHide_promo_code() {
		return hide_promo_code;
	}
	public void setHide_promo_code(Boolean hide_promo_code) {
		this.hide_promo_code = hide_promo_code;
	}
	public Boolean getHide_cost_center() {
		return hide_cost_center;
	}
	public void setHide_cost_center(Boolean hide_cost_center) {
		this.hide_cost_center = hide_cost_center;
	}
	public Boolean getHide_project_code() {
		return hide_project_code;
	}
	public void setHide_project_code(Boolean hide_project_code) {
		this.hide_project_code = hide_project_code;
	}
	public Boolean getHide_department() {
		return hide_department;
	}
	public void setHide_department(Boolean hide_department) {
		this.hide_department = hide_department;
	}
	public Boolean getHide_location() {
		return hide_location;
	}
	public void setHide_location(Boolean hide_location) {
		this.hide_location = hide_location;
	}
	public Boolean getHide_employee_id() {
		return hide_employee_id;
	}
	public void setHide_employee_id(Boolean hide_employee_id) {
		this.hide_employee_id = hide_employee_id;
	}
	public Boolean getHide_booking_by() {
		return hide_booking_by;
	}
	public void setHide_booking_by(Boolean hide_booking_by) {
		this.hide_booking_by = hide_booking_by;
	}
	public Boolean getHide_trf() {
		return hide_trf;
	}
	public void setHide_trf(Boolean hide_trf) {
		this.hide_trf = hide_trf;
	}
	public Boolean getHide_all_pax_contact() {
		return hide_all_pax_contact;
	}
	public void setHide_all_pax_contact(Boolean hide_all_pax_contact) {
		this.hide_all_pax_contact = hide_all_pax_contact;
	}
	public String getGst_details() {
		return gst_details;
	}
	public void setGst_details(String gst_details) {
		this.gst_details = gst_details;
	}
	public Boolean getService_class() {
		return service_class;
	}
	public void setService_class(Boolean service_class) {
		this.service_class = service_class;
	}
	public Boolean getShow_contact_address() {
		return show_contact_address;
	}
	public void setShow_contact_address(Boolean show_contact_address) {
		this.show_contact_address = show_contact_address;
	}
	public Boolean getShow_paid_seat() {
		return show_paid_seat;
	}
	public void setShow_paid_seat(Boolean show_paid_seat) {
		this.show_paid_seat = show_paid_seat;
	}
	@Override
	public String toString() {
		return "Companybranch [id=" + id + ", name=" + name + ", parent=" + parent + ", hierarchical_level="
				+ hierarchical_level + ", type=" + type + ", status=" + status + ", created_date=" + created_date
				+ ", last_modified_date=" + last_modified_date + ", modified_by=" + modified_by + ", logo_url="
				+ logo_url + ", industry_type=" + industry_type + ", account_type=" + account_type + ", max_limit="
				+ max_limit + ", available_balance=" + available_balance + ", c_gst=" + c_gst + ", s_gst=" + s_gst
				+ ", travel_policy=" + travel_policy + ", is_auto_nvoicing=" + is_auto_nvoicing
				+ ", invoicing_package_name=" + invoicing_package_name + ", plan_Type=" + plan_Type
				+ ", booking_prefix=" + booking_prefix + ", invoicing_prefix=" + invoicing_prefix
				+ ", invoicing_template=" + invoicing_template + ", cin_number=" + cin_number + ", signature="
				+ signature + ", pan_number=" + pan_number + ", hsn_sac_code=" + hsn_sac_code + ", is_protect="
				+ is_protect + ", dasboard_banner=" + dasboard_banner + ", protect_amount=" + protect_amount
				+ ", exclude_airline=" + exclude_airline + ", show_deposite=" + show_deposite + ", show_fare_rule="
				+ show_fare_rule + ", fare_rule_airlines=" + fare_rule_airlines + ", hide_ticket_fare="
				+ hide_ticket_fare + ", hide_fare_type=" + hide_fare_type + ", hide_promo_code=" + hide_promo_code
				+ ", hide_cost_center=" + hide_cost_center + ", hide_project_code=" + hide_project_code
				+ ", hide_department=" + hide_department + ", hide_location=" + hide_location + ", hide_employee_id="
				+ hide_employee_id + ", hide_booking_by=" + hide_booking_by + ", hide_trf=" + hide_trf
				+ ", hide_all_pax_contact=" + hide_all_pax_contact + ", gst_details=" + gst_details + ", service_class="
				+ service_class + ", show_contact_address=" + show_contact_address + ", show_paid_seat="
				+ show_paid_seat + ", getId()=" + getId() + ", getName()=" + getName() + ", getParent()=" + getParent()
				+ ", getHierarchical_level()=" + getHierarchical_level() + ", getType()=" + getType() + ", getStatus()="
				+ getStatus() + ", getCreated_date()=" + getCreated_date() + ", getLast_modified_date()="
				+ getLast_modified_date() + ", getModified_by()=" + getModified_by() + ", getLogo_url()="
				+ getLogo_url() + ", getIndustry_type()=" + getIndustry_type() + ", getAccount_type()="
				+ getAccount_type() + ", getMax_limit()=" + getMax_limit() + ", getAvailable_balance()="
				+ getAvailable_balance() + ", getC_gst()=" + getC_gst() + ", getS_gst()=" + getS_gst()
				+ ", getTravel_policy()=" + getTravel_policy() + ", getIs_auto_nvoicing()=" + getIs_auto_nvoicing()
				+ ", getInvoicing_package_name()=" + getInvoicing_package_name() + ", getPlan_Type()=" + getPlan_Type()
				+ ", getBooking_prefix()=" + getBooking_prefix() + ", getInvoicing_prefix()=" + getInvoicing_prefix()
				+ ", getInvoicing_template()=" + getInvoicing_template() + ", getCin_number()=" + getCin_number()
				+ ", getSignature()=" + getSignature() + ", getPan_number()=" + getPan_number() + ", getHsn_sac_code()="
				+ getHsn_sac_code() + ", getIs_protect()=" + getIs_protect() + ", getDasboard_banner()="
				+ getDasboard_banner() + ", getProtect_amount()=" + getProtect_amount() + ", getExclude_airline()="
				+ getExclude_airline() + ", getShow_deposite()=" + getShow_deposite() + ", getShow_fare_rule()="
				+ getShow_fare_rule() + ", getFare_rule_airlines()=" + getFare_rule_airlines()
				+ ", getHide_ticket_fare()=" + getHide_ticket_fare() + ", getHide_fare_type()=" + getHide_fare_type()
				+ ", getHide_promo_code()=" + getHide_promo_code() + ", getHide_cost_center()=" + getHide_cost_center()
				+ ", getHide_project_code()=" + getHide_project_code() + ", getHide_department()="
				+ getHide_department() + ", getHide_location()=" + getHide_location() + ", getHide_employee_id()="
				+ getHide_employee_id() + ", getHide_booking_by()=" + getHide_booking_by() + ", getHide_trf()="
				+ getHide_trf() + ", getHide_all_pax_contact()=" + getHide_all_pax_contact() + ", getGst_details()="
				+ getGst_details() + ", getService_class()=" + getService_class() + ", getShow_contact_address()="
				+ getShow_contact_address() + ", getShow_paid_seat()=" + getShow_paid_seat() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}

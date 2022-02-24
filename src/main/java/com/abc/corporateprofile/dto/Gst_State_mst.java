package com.abc.corporateprofile.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Gst_State_mst {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Integer id;
	private String state_code;
	private String state_name;
	private String provision_state_code;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getState_code() {
		return state_code;
	}
	public void setState_code(String state_code) {
		this.state_code = state_code;
	}
	public String getState_name() {
		return state_name;
	}
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}
	public String getProvision_state_code() {
		return provision_state_code;
	}
	public void setProvision_state_code(String provision_state_code) {
		this.provision_state_code = provision_state_code;
	}
	@Override
	public String toString() {
		return "Gst_State_mst [id=" + id + ", state_code=" + state_code + ", state_name=" + state_name
				+ ", provision_state_code=" + provision_state_code + ", getId()=" + getId() + ", getState_code()="
				+ getState_code() + ", getState_name()=" + getState_name() + ", getProvision_state_code()="
				+ getProvision_state_code() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}

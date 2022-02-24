package com.abc.corporateprofile.travelpolicy.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DomesticAirPolicy {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
	
	@Column(name = "travelType")
	public String travelType;
	
	@Column (name = "airline_preference")
    public String airline_preference;
    
	@Column (name = "preferredAirlines")
    public String preferredAirlines;
	
	@Column (name = "corporate_card")
    public String corporate_card;
	
	@Column (name = "ref_tickets")
    public String ref_tickets;
	
	@Column (name = "stopover")
    public String stopover;
	
	@Column (name = "stopoverLimit")
    public String stopoverLimit;
	
	@Column (name = "limitEmployees")
    public String limitEmployees;
	
	@Column (name = "maxEmployees")
    public String maxEmployees;
	
	@Column (name = "advanceBooking")
    public String advanceBooking;
	
	@Column (name = "advanceDays")
    public String advanceDays;
	
	@Column (name = "emerTravel")
    public String emerTravel;
	
	@Column (name = "classPreference")
    public String classPreference;
	
	@Column (name = "allowClassChange")
    public String allowClassChange;
	
	@Column (name = "allowOnlyDuration")
    public String allowOnlyDuration;
	
	@Column (name = "travelEligibility")
    public String travelEligibility;
	
	@Column (name = "maxAirfare")
    public String maxAirfare;
	
	@Column (name = "maxAirfareReturn")
    public String maxAirfareReturn;
	
	@Column (name = "include_meal")
    public String include_meal;
	
	@Column (name = "include_seat")
    public String include_seat;
	
	@Column (name = "include_miscellaneous")
    public String include_miscellaneous;
	
	@Column (name = "insurance")
    public String insurance;
	
	@Column (name = "allowCancellation")
    public String allowCancellation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTravelType() {
		return travelType;
	}

	public void setTravelType(String travelType) {
		this.travelType = travelType;
	}

	public String getAirline_preference() {
		return airline_preference;
	}

	public void setAirline_preference(String airline_preference) {
		this.airline_preference = airline_preference;
	}

	public String getPreferredAirlines() {
		return preferredAirlines;
	}

	public void setPreferredAirlines(String preferredAirlines) {
		this.preferredAirlines = preferredAirlines;
	}

	public String getCorporate_card() {
		return corporate_card;
	}

	public void setCorporate_card(String corporate_card) {
		this.corporate_card = corporate_card;
	}

	public String getRef_tickets() {
		return ref_tickets;
	}

	public void setRef_tickets(String ref_tickets) {
		this.ref_tickets = ref_tickets;
	}

	public String getStopover() {
		return stopover;
	}

	public void setStopover(String stopover) {
		this.stopover = stopover;
	}

	public String getStopoverLimit() {
		return stopoverLimit;
	}

	public void setStopoverLimit(String stopoverLimit) {
		this.stopoverLimit = stopoverLimit;
	}

	public String getLimitEmployees() {
		return limitEmployees;
	}

	public void setLimitEmployees(String limitEmployees) {
		this.limitEmployees = limitEmployees;
	}

	public String getMaxEmployees() {
		return maxEmployees;
	}

	public void setMaxEmployees(String maxEmployees) {
		this.maxEmployees = maxEmployees;
	}

	public String getAdvanceBooking() {
		return advanceBooking;
	}

	public void setAdvanceBooking(String advanceBooking) {
		this.advanceBooking = advanceBooking;
	}

	public String getAdvanceDays() {
		return advanceDays;
	}

	public void setAdvanceDays(String advanceDays) {
		this.advanceDays = advanceDays;
	}

	public String getEmerTravel() {
		return emerTravel;
	}

	public void setEmerTravel(String emerTravel) {
		this.emerTravel = emerTravel;
	}

	public String getClassPreference() {
		return classPreference;
	}

	public void setClassPreference(String classPreference) {
		this.classPreference = classPreference;
	}

	public String getAllowClassChange() {
		return allowClassChange;
	}

	public void setAllowClassChange(String allowClassChange) {
		this.allowClassChange = allowClassChange;
	}

	public String getAllowOnlyDuration() {
		return allowOnlyDuration;
	}

	public void setAllowOnlyDuration(String allowOnlyDuration) {
		this.allowOnlyDuration = allowOnlyDuration;
	}

	public String getTravelEligibility() {
		return travelEligibility;
	}

	public void setTravelEligibility(String travelEligibility) {
		this.travelEligibility = travelEligibility;
	}

	public String getMaxAirfare() {
		return maxAirfare;
	}

	public void setMaxAirfare(String maxAirfare) {
		this.maxAirfare = maxAirfare;
	}

	public String getMaxAirfareReturn() {
		return maxAirfareReturn;
	}

	public void setMaxAirfareReturn(String maxAirfareReturn) {
		this.maxAirfareReturn = maxAirfareReturn;
	}

	public String getInclude_meal() {
		return include_meal;
	}

	public void setInclude_meal(String include_meal) {
		this.include_meal = include_meal;
	}

	public String getInclude_seat() {
		return include_seat;
	}

	public void setInclude_seat(String include_seat) {
		this.include_seat = include_seat;
	}

	public String getInclude_miscellaneous() {
		return include_miscellaneous;
	}

	public void setInclude_miscellaneous(String include_miscellaneous) {
		this.include_miscellaneous = include_miscellaneous;
	}

	public String getInsurance() {
		return insurance;
	}

	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}

	public String getAllowCancellation() {
		return allowCancellation;
	}

	public void setAllowCancellation(String allowCancellation) {
		this.allowCancellation = allowCancellation;
	}

	@Override
	public String toString() {
		return "DomesticAirPolicy [id=" + id + ", travelType=" + travelType + ", airline_preference="
				+ airline_preference + ", preferredAirlines=" + preferredAirlines + ", corporate_card=" + corporate_card
				+ ", ref_tickets=" + ref_tickets + ", stopover=" + stopover + ", stopoverLimit=" + stopoverLimit
				+ ", limitEmployees=" + limitEmployees + ", maxEmployees=" + maxEmployees + ", advanceBooking="
				+ advanceBooking + ", advanceDays=" + advanceDays + ", emerTravel=" + emerTravel + ", classPreference="
				+ classPreference + ", allowClassChange=" + allowClassChange + ", allowOnlyDuration="
				+ allowOnlyDuration + ", travelEligibility=" + travelEligibility + ", maxAirfare=" + maxAirfare
				+ ", maxAirfareReturn=" + maxAirfareReturn + ", include_meal=" + include_meal + ", include_seat="
				+ include_seat + ", include_miscellaneous=" + include_miscellaneous + ", insurance=" + insurance
				+ ", allowCancellation=" + allowCancellation + "]";
	}    
    
}

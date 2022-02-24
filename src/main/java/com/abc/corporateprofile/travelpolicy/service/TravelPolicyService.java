package com.abc.corporateprofile.travelpolicy.service;

import java.util.List;

import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;


public interface TravelPolicyService {
	
	//only get
	public List<DomesticAirlines> listAllDomesticAirlines();	
	
	public List<InternationalAirlines> listAllInternationalAirlines();
	
}

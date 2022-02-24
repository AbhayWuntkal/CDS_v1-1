package com.abc.corporateprofile.travelpolicy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;
import com.abc.corporateprofile.travelpolicy.service.TravelPolicyService;

@RestController
@RequestMapping(value = "/cds")
@CrossOrigin(origins="http://localhost:4200")
public class TravelPolicyController {

	@Autowired
	TravelPolicyService tpservice;
	
	@GetMapping(value = "/listAllDomesticAirlines")
	public List<DomesticAirlines> listAllDomesticAirlines()  {
		//System.out.println(listAllDomesticAirlines());
		return tpservice.listAllDomesticAirlines();	
	}
	
	@GetMapping(value = "/listAllInternationalAirlines")
	public List<InternationalAirlines> listAllInternationalAirlines()  {
		//System.out.println(listAllInternationalAirlines());
		return tpservice.listAllInternationalAirlines();	
	}
	
}

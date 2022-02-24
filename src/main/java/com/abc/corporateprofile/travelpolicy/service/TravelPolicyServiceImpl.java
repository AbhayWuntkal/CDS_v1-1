package com.abc.corporateprofile.travelpolicy.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;
import com.abc.corporateprofile.travelpolicy.repository.DomesticAirlinesRepository;
import com.abc.corporateprofile.travelpolicy.repository.InternationalAirlinesRepository;

@Service("tpservice")
@Transactional
public class TravelPolicyServiceImpl implements TravelPolicyService  {
	
	@Autowired
	DomesticAirlinesRepository domesticAirlinesRepository;
	public List<DomesticAirlines> listAllDomesticAirlines() {
		// TODO Auto-generated method stub
		return domesticAirlinesRepository.findAll();
	}
	
	@Autowired
	InternationalAirlinesRepository internationalAirlinesRepository;
	public List<InternationalAirlines> listAllInternationalAirlines() {
		// TODO Auto-generated method stub
		return internationalAirlinesRepository.findAll();
	}
}
package com.abc.corporateprofile.travelpolicy.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Designations;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;
import com.abc.corporateprofile.travelpolicy.excel.ExcelHelper;
import com.abc.corporateprofile.travelpolicy.repository.DesignationsRepository;
import com.abc.corporateprofile.travelpolicy.repository.DomesticAirlinesRepository;
import com.abc.corporateprofile.travelpolicy.repository.InternationalAirlinesRepository;

@Service("tpservice")
@Transactional
public class TravelPolicyServiceImpl implements TravelPolicyService {

// All Repositories

	@Autowired
	DomesticAirlinesRepository domesticAirlinesRepository;
	
	@Autowired
	InternationalAirlinesRepository internationalAirlinesRepository;
	
	@Autowired
	DesignationsRepository designationsRepository;
	
	
// Fetch API for Airline Names
	
	public List<DomesticAirlines> listAllDomesticAirlines() {
		return domesticAirlinesRepository.findAll();
	}

	public List<InternationalAirlines> listAllInternationalAirlines() {
		return internationalAirlinesRepository.findAll();
	}

	
// Designations Services 

	// Create Departments
	@Override
	public void addDesignation(Designations addDesignation) {
		designationsRepository.save(addDesignation);
	}

	// Retrieve Departments
	@Override
	public List<Designations> listAllDesignations() {
		return designationsRepository.findAll();
	}

	// Update Departments
	@Override
	public void updateDesignationById(Integer id, String designations_name, String department_name, Integer modified_by) {
		designationsRepository.updateDesignationById(id, designations_name, department_name, modified_by);
	}

	// Delete Departments
	@Override
	public void deleteDesignationById(int id) {
		designationsRepository.deleteById(id);
	}

	// Save Excel Sheet
	@Override
	public void saveDesignations(MultipartFile file) {
		try {
			List<Designations> designations = ExcelHelper.excelToDesignations(file.getInputStream());
			designationsRepository.saveAll(designations);
		} catch (IOException e) {
			throw new RuntimeException("Failed to store excel data: " + e.getMessage());
		}
	}
}
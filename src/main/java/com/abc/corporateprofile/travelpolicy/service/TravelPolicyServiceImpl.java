package com.abc.corporateprofile.travelpolicy.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;
import com.abc.corporateprofile.travelpolicy.dto.Designations;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;
import com.abc.corporateprofile.travelpolicy.excel.ExcelHelper;
import com.abc.corporateprofile.travelpolicy.repository.DepartmentsRepository;
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
	DepartmentsRepository departmentsRepository;
	
	@Autowired
	DesignationsRepository designationsRepository;
	
	
// Fetch API for Airline Names
	
	public List<DomesticAirlines> listAllDomesticAirlines() {
		return domesticAirlinesRepository.findAll();
	}

	public List<InternationalAirlines> listAllInternationalAirlines() {
		return internationalAirlinesRepository.findAll();
	}

	
// Department Services 

	// Create Departments
	@Override
	public void addDepartment(Departments addDepartment) {
		departmentsRepository.save(addDepartment);
	}

	// Retrieve Departments
	@Override
	public List<Departments> listAllDepartments() {
		return departmentsRepository.findAll();
	}

	// Update Departments
	@Override
	public void updateDepartmentById(Integer department_id, String department_name, String department_code,
			Integer modified_by) {
		departmentsRepository.updateDapartmentById(department_id, department_name, department_code, modified_by);
	}

	// Delete Departments
	@Override
	public void deleteDepartmentById(int department_id) {
		departmentsRepository.deleteById(department_id);
	}

	// Save Excel Sheet
	@Override
	public void saveDepartments(MultipartFile file) {
		try {
			List<Departments> departments = ExcelHelper.excelToDepartments(file.getInputStream());
			departmentsRepository.saveAll(departments);
		} catch (IOException e) {
			throw new RuntimeException("Failed to store excel data: " + e.getMessage());
		}
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
	public void updateDesignationById(Integer id, String designations_name, String designations_code,
			Integer modified_by) {
		designationsRepository.updateDesignationById(id, designations_name, designations_code, modified_by);
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
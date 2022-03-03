package com.abc.corporateprofile.travelpolicy.service;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;
import com.abc.corporateprofile.travelpolicy.dto.Designations;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;


public interface TravelPolicyService {
	
	//List all domestic airline names
	public List<DomesticAirlines> listAllDomesticAirlines();	
	
	//List all international airline names
	public List<InternationalAirlines> listAllInternationalAirlines();

	
// Department Master	
	
	// Create
	public void addDepartment(Departments addDepartment);

	// Retrieve
	public List<Departments> listAllDepartments();
	
	// Update
	public void updateDepartmentById(Integer id, String department_name, String department_code, Integer modified_by);

	// Delete
	public void deleteDepartmentById(int id);

	// Master file to save excel sheet
	public void saveDepartments(MultipartFile file);
	
// Department Master	

	// Create
	public void addDesignation(Designations addDesignation);

	// Retrieve
	public List<Designations> listAllDesignations();
	
	// Update
	public void updateDesignationById(Integer id, String designation_name, String designation_code, Integer modified_by);

	// Delete
	public void deleteDesignationById(int id);

	// Master file to save excel sheet
	public void saveDesignations(MultipartFile file);
}

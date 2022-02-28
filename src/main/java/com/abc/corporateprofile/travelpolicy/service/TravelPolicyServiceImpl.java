package com.abc.corporateprofile.travelpolicy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;


public interface TravelPolicyServiceImpl {
	
	//List all domestic airline names
	public List<DomesticAirlines> listAllDomesticAirlines();	
	
	//List all international airline names
	public List<InternationalAirlines> listAllInternationalAirlines();

	
// Department Master	
	
	// Create
	public void AddDepartment(Departments addDepartment);

	// Retrieve
	public List<Departments> listAllDepartments();
	
	// Update
	public void UpdateDepartmentById(Integer department_id, String department_name, String department_code, String modified_by, String modified_date);

	//Delete
	public void deleteDepartmentById(int department_id);

	public static Optional<Departments> UpdateDepartmentById(Long department_id) {
		return null;
	}

	public void save(MultipartFile file);

	public List<Departments> getAllDepartments();

}

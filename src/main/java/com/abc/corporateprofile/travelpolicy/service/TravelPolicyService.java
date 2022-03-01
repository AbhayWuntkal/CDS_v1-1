package com.abc.corporateprofile.travelpolicy.service;

import java.io.IOException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;
import com.abc.corporateprofile.travelpolicy.excel.ExcelHelper;
import com.abc.corporateprofile.travelpolicy.repository.DepartmentsRepository;
import com.abc.corporateprofile.travelpolicy.repository.DomesticAirlinesRepository;
import com.abc.corporateprofile.travelpolicy.repository.InternationalAirlinesRepository;

@Service("tpservice")
@Transactional
public class TravelPolicyService implements TravelPolicyServiceImpl {

	@Autowired
	DomesticAirlinesRepository domesticAirlinesRepository;

	public List<DomesticAirlines> listAllDomesticAirlines() {
		return domesticAirlinesRepository.findAll();
	}

	@Autowired
	InternationalAirlinesRepository internationalAirlinesRepository;

	public List<InternationalAirlines> listAllInternationalAirlines() {
		return internationalAirlinesRepository.findAll();
	}

	@Autowired
	DepartmentsRepository departmentsRepository;

	@Override
	public List<Departments> listAllDepartments() {
		return departmentsRepository.findAll();
	}

	@Override
	public void AddDepartment(Departments addDepartment) {
		departmentsRepository.save(addDepartment);
	}

	@Override
	public void UpdateDepartmentById(Integer department_id, String department_name, String department_code,
			String modified_by, String modified_date) {
		departmentsRepository.updateDapartmentById(department_id, department_name, department_code, modified_by,
				modified_date);
	}

	@Override
	public void deleteDepartmentById(int department_id) {
		departmentsRepository.deleteById(department_id);
	}

// Excel Sheet

	@Override
	public void save(MultipartFile file) {
		try {
			List<Departments> departments = ExcelHelper.excelToDepartments(file.getInputStream());
			departmentsRepository.saveAll(departments);
		} catch (IOException e) {
			throw new RuntimeException("Failed to store excel data: " + e.getMessage());
		}
	}

}
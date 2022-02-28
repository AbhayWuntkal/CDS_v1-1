package com.abc.corporateprofile.travelpolicy.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;
import com.abc.corporateprofile.travelpolicy.dto.InternationalAirlines;
import com.abc.corporateprofile.travelpolicy.excel.ExcelHelper;
import com.abc.corporateprofile.travelpolicy.excel.ResponseMessage;
import com.abc.corporateprofile.travelpolicy.service.TravelPolicyServiceImpl;

@RestController
@RequestMapping(value = "/cds")
@CrossOrigin(origins = "http://localhost:4200")
public class TravelPolicyController {

	@Autowired
	TravelPolicyServiceImpl tpservice;

	// Fetch Domestic Airlines Names
	@GetMapping(value = "/listAllDomesticAirlines")
	public List<DomesticAirlines> listAllDomesticAirlines() {
		// System.out.println(listAllDomesticAirlines());
		return tpservice.listAllDomesticAirlines();
	}

	// Fetch International Airlines Names
	@GetMapping(value = "/listAllInternationalAirlines")
	public List<InternationalAirlines> listAllInternationalAirlines() {
		// System.out.println(listAllInternationalAirlines());
		return tpservice.listAllInternationalAirlines();
	}

// Department Master

	// Create Department
	@PostMapping(value = "/AddDepartment")
	public void AddPassport_master(@RequestBody Departments addDepartment) {
		tpservice.AddDepartment(addDepartment);
	}

	// Retrieve Department
	@GetMapping(value = "/listAllDepartments")
	public List<Departments> listAllDepartments() {
		// System.out.println(listAllDepartments());
		return tpservice.listAllDepartments();
	}

	// Update Department
	@PostMapping(value = "/UpdateDepartmentById")
	public void UpdateDepartmentById(@RequestParam("department_id") Integer department_id,
			@RequestParam("department_name") String department_name,
			@RequestParam("department_code") String department_code,
			@RequestParam("department_code") String modified_by,
			@RequestParam("department_code") String modified_date) {
			tpservice.UpdateDepartmentById(department_id, department_name, department_code, modified_by, modified_date);
	}

	// Delete Department
	@DeleteMapping("/deleteDepartmentById/{department_id}")
	private void deletegst(@PathVariable("department_id") int department_id) {
		tpservice.deleteDepartmentById(department_id);
	}

// Department File upload Master
	
	@PostMapping("/upload")
	  public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("file") MultipartFile file) {
	    String message = "";
	    if (ExcelHelper.hasExcelFormat(file)) {
	      try {
	    	  tpservice.save(file);
	        message = "Uploaded the file successfully: " + file.getOriginalFilename();
	        return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	      } catch (Exception e) {
	        message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	      }
	    }
	    message = "Please upload an excel file!";
	    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
	  }
	  @GetMapping("/departments")
	  public ResponseEntity<List<Departments>> getAllDepartments() {
	    try {
	      List<Departments> departments = tpservice.getAllDepartments();
	      if (departments.isEmpty()) {
	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	      }
	      return new ResponseEntity<>(departments, HttpStatus.OK);
	    } catch (Exception e) {
	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	  }
	
}

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
import com.abc.corporateprofile.travelpolicy.excel.ExcelHelper;
import com.abc.corporateprofile.travelpolicy.excel.ResponseMessage;
import com.abc.corporateprofile.travelpolicy.service.TravelPolicyServiceImpl;

@RestController
@RequestMapping(value = "/departments")
@CrossOrigin(origins = "http://localhost:4200")
public class DepartmentController {

	@Autowired
	TravelPolicyServiceImpl tpservice;

// Department Master

	// Create Department
	@PostMapping(value = "/addDepartment")
	public void addDepartment(@RequestBody Departments addDepartment) {
		tpservice.addDepartment(addDepartment);
	}

	// Retrieve Department
	@GetMapping(value = "/listAllDepartments")
	public ResponseEntity<List<Departments>> listAllDepartments() {
		try {
			List<Departments> departments = tpservice.listAllDepartments();
			if (departments.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(departments, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Update Department
	@PostMapping(value = "/UpdateDepartmentById")
	public ResponseEntity<ResponseMessage> UpdateDepartmentById(@RequestParam("id") Integer id,
			@RequestParam("department_name") String department_name,
			@RequestParam("department_code") String department_code, @RequestParam("modified_by") Integer modified_by) {
		String message = "";
		try {
			tpservice.updateDepartmentById(id, department_name, department_code, modified_by);
			message = "Updated successfully for department with id: " + id;
			System.out.println("Updated successfully for department with id: " + id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));

		} catch (Exception e) {
			message = "Could not update the desired department info with id: " + id + "!";
			System.out.println("Could not update the desired department info with id: " + id + "!");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
		}
	}

	// Delete Department
	@DeleteMapping("/deleteDepartmentById/{id}")
	private void deleteDepartmentById(@PathVariable("id") int id) {
		tpservice.deleteDepartmentById(id);
	}

	// Department excel file upload Master
	@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("File") MultipartFile file) {
		String message = "";
		if (ExcelHelper.isExcelFormat(file)) {
			try {
				tpservice.saveDepartments(file);
				message = "Uploaded the file successfully: " + file.getOriginalFilename();
				return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
			} catch (Exception e) {
				message = "Could not upload the file: " + file.getOriginalFilename() + "!";
				return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
			}
		} else {
			message = file.getOriginalFilename() + " is not an excel file";
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
		}
	}

}
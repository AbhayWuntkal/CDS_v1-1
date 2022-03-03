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

import com.abc.corporateprofile.travelpolicy.dto.Designations;
import com.abc.corporateprofile.travelpolicy.excel.ExcelHelper;
import com.abc.corporateprofile.travelpolicy.excel.ResponseMessage;
import com.abc.corporateprofile.travelpolicy.service.TravelPolicyServiceImpl;

@RestController
@RequestMapping(value = "/designations")
@CrossOrigin(origins = "http://localhost:4200")
public class DesignationController {

	@Autowired
	TravelPolicyServiceImpl tpservice;

// Designation Master

	// Create Designation
	@PostMapping(value = "/addDesignation")
	public void addDesignation(@RequestBody Designations addDesignation) {
		tpservice.addDesignation(addDesignation);
	}

	// Retrieve Designation
	@GetMapping(value = "/listAllDesignations")
	public ResponseEntity<List<Designations>> listAllDesignations() {
		try {
			List<Designations> designations = tpservice.listAllDesignations();
			if (designations.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(designations, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Update Designation
	@PostMapping(value = "/UpdateDesignationById")
	public ResponseEntity<ResponseMessage> UpdateDesignationById(@RequestParam("id") Integer id,
			@RequestParam("designation_name") String designation_name,
			@RequestParam("designation_code") String designation_code,
			@RequestParam("modified_by") Integer modified_by) {
		String message = "";
		try {
			tpservice.updateDesignationById(id, designation_name, designation_code, modified_by);
			message = "Updated successfully for designation with id: " + id;
			System.out.println("Updated successfully for designation with id: " + id);
			return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));

		} catch (Exception e) {
			message = "Could not update the desired designation info with id: " + id + "!";
			System.out.println("Could not update the desired designation info with id: " + id + "!");
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ResponseMessage(message));
		}
	}

	// Delete Designation
	@DeleteMapping("/deleteDesignationById/{id}")
	private void deleteDesignationById(@PathVariable("id") int id) {
		tpservice.deleteDesignationById(id);
	}

	// Designation excel file upload Master
	@PostMapping("/upload")
	public ResponseEntity<ResponseMessage> uploadFile(@RequestParam("File") MultipartFile file) {
		String message = "";
		if (ExcelHelper.isExcelFormat(file)) {
			try {
				tpservice.saveDesignations(file);
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
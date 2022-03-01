package com.abc.corporateprofile.travelpolicy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {

	@Modifying
	@Query("UPDATE Departments d SET d.department_name=:department_name, d.department_code=:department_code, d.modified_by=:modified_by, d.modified_date=:modified_date WHERE d.department_id=:department_id")
	public void updateDapartmentById(@Param("department_id") Integer department_id,
			@Param("department_name") String department_name, @Param("modified_by") String modified_by,
			@Param("department_name") String modified_date, @Param("modified_date") String department_code);

}

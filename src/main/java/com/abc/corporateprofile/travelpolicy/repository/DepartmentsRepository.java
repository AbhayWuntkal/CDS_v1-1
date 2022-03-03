package com.abc.corporateprofile.travelpolicy.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.corporateprofile.travelpolicy.dto.Departments;

public interface DepartmentsRepository extends JpaRepository<Departments, Integer> {

	@Modifying
	@Transactional
	@Query("UPDATE Departments d SET d.department_name=:department_name, d.department_code=:department_code, d.modified_by=:modified_by WHERE d.id=:id")
	public void updateDapartmentById(@Param("id") Integer id, @Param("department_name") String department_name,
			@Param("department_code") String department_code, @Param("modified_by") Integer modified_by);

}

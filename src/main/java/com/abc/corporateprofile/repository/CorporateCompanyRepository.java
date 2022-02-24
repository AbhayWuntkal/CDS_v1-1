package com.abc.corporateprofile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.abc.corporateprofile.dto.Company;
import com.abc.corporateprofile.dto.User_Details;

public interface CorporateCompanyRepository extends JpaRepository<Company, Integer> {

	@Query("SELECT l FROM User_Details l WHERE company_id=:company_id")
	public List<User_Details> getalluser(@Param("company_id")Integer company_id);

}


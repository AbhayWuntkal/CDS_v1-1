package com.abc.corporateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.corporateprofile.dto.Insurance;


public interface CorporateInsuranceMasterRepository extends JpaRepository<Insurance, Integer> {

}

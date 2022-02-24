package com.abc.corporateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.corporateprofile.dto.Passport;



public interface CorporatePassportMasterRepository extends JpaRepository<Passport, Integer> {

}

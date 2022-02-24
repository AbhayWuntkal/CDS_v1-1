package com.abc.corporateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.corporateprofile.dto.Bank_Details;



public interface CorporateBankDetailsRepository extends JpaRepository<Bank_Details, Integer> {

}

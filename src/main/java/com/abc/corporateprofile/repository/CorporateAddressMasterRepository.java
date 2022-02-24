package com.abc.corporateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.corporateprofile.dto.Address_master;

public interface CorporateAddressMasterRepository extends JpaRepository<Address_master, Integer> {

}

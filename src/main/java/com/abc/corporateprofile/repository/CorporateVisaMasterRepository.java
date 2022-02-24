package com.abc.corporateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.corporateprofile.dto.Visa;


public interface CorporateVisaMasterRepository extends JpaRepository<Visa, Integer> {

}

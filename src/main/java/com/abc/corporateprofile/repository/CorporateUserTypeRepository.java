package com.abc.corporateprofile.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.corporateprofile.dto.User_Type;


public interface CorporateUserTypeRepository extends JpaRepository<User_Type, Integer> {

}

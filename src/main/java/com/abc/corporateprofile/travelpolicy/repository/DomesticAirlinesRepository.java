package com.abc.corporateprofile.travelpolicy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.abc.corporateprofile.travelpolicy.dto.DomesticAirlines;

public interface DomesticAirlinesRepository  extends JpaRepository<DomesticAirlines, Integer> {

}
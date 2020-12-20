package com.onebill.billhelper.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.onebill.billhelper.entity.Company;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public interface CompanyRepository extends JpaRepository<Company, Integer> {

//	@Query("SELECT new com.onebill.billhelper.dto.CompanyResponseDto(c.companyName, p.productName) FROM Company c JOIN c.Product p")
//	public List<comapnyResponseDto> findByCompanyName();

	
	
} 	

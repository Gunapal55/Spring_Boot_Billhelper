package com.onebill.billhelper.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class CompanyDto {

	private String companyName;
	private String companyDomain;
	private String companyEmail;
	private String companyPassword;
	private String companylocation;
	
	
}

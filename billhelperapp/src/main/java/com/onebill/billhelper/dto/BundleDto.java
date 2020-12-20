package com.onebill.billhelper.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;


@Data
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class BundleDto {

	private String bundleDescription;
	
	private String bundleType;
	
	private String bundleDuration;
	
	private Double bundleCost;
	
}

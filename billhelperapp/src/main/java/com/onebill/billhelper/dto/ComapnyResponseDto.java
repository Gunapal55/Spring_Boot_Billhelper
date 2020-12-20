package com.onebill.billhelper.dto;

import com.onebill.billhelper.entity.Company;
import com.onebill.billhelper.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ComapnyResponseDto {

	private Company companyName;
	private Product productName;

}

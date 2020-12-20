package com.onebill.billhelper.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.billhelper.dao.CompanyRepository;
import com.onebill.billhelper.dao.ProductRepository;
import com.onebill.billhelper.entity.Company;
import com.onebill.billhelper.entity.Product;

@RequestMapping("/company")
@RestController
public class CompanyController {

	@Autowired
	private CompanyRepository companyRepo;

	@PostMapping
	public Company adddCompany(@RequestBody Company company) {
		return companyRepo.save(company);
	}

	@GetMapping("/companies")
	public List<Company> getAllCompany() {
		return companyRepo.findAll();
	}

	@DeleteMapping
	public Company removeCompany(@RequestBody Company company) {
		companyRepo.delete(company);
		return company;
	}

	@PutMapping
	public Company updateCompany(@RequestBody Company company) {
		return companyRepo.save(company);

	}

}

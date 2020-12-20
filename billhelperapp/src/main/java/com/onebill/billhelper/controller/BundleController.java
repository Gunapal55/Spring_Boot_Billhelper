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

import com.onebill.billhelper.dao.BundleDetailsRepository;
import com.onebill.billhelper.dao.BundleRepository;
import com.onebill.billhelper.entity.Bundle;

@RestController
@RequestMapping("/plan/bundle")
public class BundleController {

	@Autowired
	private BundleRepository bundleRepo;

	@Autowired
	private BundleDetailsRepository bundleDetailsRepo;

	@PostMapping
	public Bundle addBundle(@RequestBody Bundle bundle) {
		return bundleRepo.save(bundle);
	}

	@PutMapping
	public Bundle updateBundle(@RequestBody Bundle bundle) {
		return bundleRepo.save(bundle);
	}

	@DeleteMapping
	public Bundle deleteBundle(@RequestBody Bundle bundle) {
		bundleRepo.delete(bundle);
		return bundle;
	}

	@GetMapping("/bundles")
	public List<Bundle> getAllBundles() {
		return bundleRepo.findAll();
	}

}

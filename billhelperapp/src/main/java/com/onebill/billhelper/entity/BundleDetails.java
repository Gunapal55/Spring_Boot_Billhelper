package com.onebill.billhelper.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "bundle_details")
public class BundleDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bundleDetailsId;

	private String bundleType;
	
	private String bundleDescription;

	@OneToMany(targetEntity = BundleOverDue.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bundleDetail_id", referencedColumnName = "bundleDetailsId")
	private List<BundleOverDue> bundleOverDues;

	@OneToMany(targetEntity = Addtional.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "bundleDetail_id", referencedColumnName = "bundleDetailsId")
	private List<Addtional> addtionals;

	
	
} 

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

@Data
@Entity
@Table(name="bundle")
public class Bundle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bundleId;
	
	private String bundleDescription;
	
	private String bundleType;
	
	private String bundleDuration;
	
	private Double bundleCost;

	@OneToMany(targetEntity = BundleDetails.class, cascade = CascadeType.ALL)
	@JoinColumn(name="bundle_id", referencedColumnName = "bundleId")
	private List<BundleDetails> bundleDetail;
	
	
}

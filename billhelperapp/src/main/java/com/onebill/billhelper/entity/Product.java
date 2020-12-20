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
@Table(name = "product")
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;

	private String productName;

	private String productType;
	
	@OneToMany(targetEntity = Bundle.class, cascade = CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName = "productId")
	private List<Bundle> bundle;
	
	
	
}

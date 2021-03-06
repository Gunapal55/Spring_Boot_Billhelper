package com.onebill.billhelper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "overdue")
public class BundleOverDue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer overDueId;

	private String overDueType;
	
	private double overDueCharge;
	
}

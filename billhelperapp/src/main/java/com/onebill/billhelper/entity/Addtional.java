package com.onebill.billhelper.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "addtional")
public class Addtional {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer addtionalId;

	private String addtionalDescription;

	private double addtionalCost;

}

package com.onebill.billhelper.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onebill.billhelper.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

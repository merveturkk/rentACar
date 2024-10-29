package com.merveturk.rentACar.repository.abstracts;

import com.merveturk.rentACar.entities.concretes.Brand;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand,Integer>{

}


package com.merveturk.rentACar.repository.abstracts;

import com.merveturk.rentACar.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List <Brand> getAll();
}


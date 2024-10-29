package com.merveturk.rentACar.business.abstracts;

import com.merveturk.rentACar.entities.concretes.Brand;
import java.util.List;


public interface BrandService {
    List<Brand> getAll();
}

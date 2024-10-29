package com.merveturk.rentACar.services;


import com.merveturk.rentACar.entities.Brand;
import com.merveturk.rentACar.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public List<Brand> getAll(){
       return  brandRepository.findAll();
    }

    

}

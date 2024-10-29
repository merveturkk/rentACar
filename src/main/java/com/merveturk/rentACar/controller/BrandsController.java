package com.merveturk.rentACar.controller;

import com.merveturk.rentACar.entities.Brand;
import com.merveturk.rentACar.services.BrandService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("brands")
public class BrandsController {

    private final BrandService brandService;

    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("/getAllBrands")
    public List<Brand> getAll(){
        return brandService.getAll();
    }

}

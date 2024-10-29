package com.merveturk.rentACar.repository.concretes;

import com.merveturk.rentACar.repository.abstracts.BrandRepository;
import com.merveturk.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {

    List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<Brand>() ;
        brands.add(new Brand(1, "Mercedes"));
        brands.add(new Brand(2, "Audi"));
        brands.add(new Brand(3, "BMW"));
        brands.add(new Brand(4, "Honda"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }

}

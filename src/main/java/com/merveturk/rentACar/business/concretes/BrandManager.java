package com.merveturk.rentACar.business.concretes;
import com.merveturk.rentACar.business.abstracts.BrandService;
import com.merveturk.rentACar.repository.abstracts.BrandRepository;
import com.merveturk.rentACar.entities.concretes.Brand;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandManager implements BrandService {

    private final BrandRepository brandRepository;

    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        // business rules
        return brandRepository.getAll();
    }
}

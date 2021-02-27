package com.aim.java.polish.brand;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class BrandController {

    @Autowired
    private BrandRepository brandRepository;

    @GetMapping(path = "/brands")
    public Iterable<Brand> getAllBrands() {
        return brandRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public Brand getBrand(@PathVariable(value = "id") Integer id) {
        Optional<Brand> brand = brandRepository.findById(id);
        return brand.get();
    }

    @PostMapping(path = "/brands/")
    public String createBrand(@RequestBody Brand brand) {
        brandRepository.save(brand);
        return "Saved";
    }

    @PutMapping(path = "/{id}")
    public String updateBrand(@PathVariable(value = "id") Integer id, @RequestBody Brand brandDetails) {
        Optional<Brand> optionalBrand = brandRepository.findById(id);
        Brand brand = optionalBrand.get();
        brand.setName(brandDetails.getName());
        brand.setVegan(brandDetails.isVegan());
        brand.setCrueltyFree(brandDetails.isCrueltyFree());
        brand.setWebsite(brandDetails.getWebsite());

        brandRepository.save(brandDetails);
        return "Updated";
    }

    @DeleteMapping(path = "/{id}")
    public String deleteBrand(@PathVariable(value = "id") Integer id) {
        brandRepository.deleteById(id);
        return "Deleted";
    }
    
}

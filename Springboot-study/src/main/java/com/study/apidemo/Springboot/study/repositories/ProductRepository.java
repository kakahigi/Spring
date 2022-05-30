package com.study.apidemo.Springboot.study.repositories;

import com.study.apidemo.Springboot.study.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

//Product la type, Long la truong key chinh
public interface ProductRepository extends JpaRepository<Product,Long> {
}

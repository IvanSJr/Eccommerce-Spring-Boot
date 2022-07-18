package com.github.ivansjr.eccommerce.dao;

import com.github.ivansjr.eccommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

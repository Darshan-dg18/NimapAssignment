package com.Nimap.nimap.Repository;

import com.Nimap.nimap.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

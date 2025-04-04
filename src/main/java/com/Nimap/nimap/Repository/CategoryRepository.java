package com.Nimap.nimap.Repository;

import com.Nimap.nimap.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

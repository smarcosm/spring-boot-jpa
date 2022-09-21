package com.smarcosm.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.smarcosm.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}

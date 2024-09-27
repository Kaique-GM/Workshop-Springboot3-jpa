package com.javacourse.springProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javacourse.springProject.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long> {


}
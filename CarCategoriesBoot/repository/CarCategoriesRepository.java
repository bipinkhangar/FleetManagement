package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.CarCategories;



public interface CarCategoriesRepository extends CrudRepository<CarCategories , Integer> {
	

}

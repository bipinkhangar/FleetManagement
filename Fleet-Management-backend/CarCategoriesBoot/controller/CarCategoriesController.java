package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.CarCategories;
import com.example.demo.service.CarCategoriesService;


@org.springframework.web.bind.annotation.RestController
public class CarCategoriesController {
	@Autowired
	private CarCategoriesService service;
	
	@PostMapping("/save-CarCategories")
	@Transactional
	public String AddCars(@RequestBody CarCategories CarCategories)
	{
		service.saveMyCars(CarCategories);
		return "Hello" +CarCategories.getCategoryname() + "your car is added sucessfully";
	}
	
	@GetMapping("/all-CarCategories")
	public Iterable<CarCategories> showAllCarCategories()
	{
		return service.showAllCarCategories();
	}
}

package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CarCategories;

import com.example.demo.repository.CarCategoriesRepository;


@Service
public class CarCategoriesService {

	@Autowired
	private CarCategoriesRepository repo;

		public CarCategoriesService()
		{}
		public CarCategoriesService(CarCategoriesRepository repo) {
			
			this.repo = repo;
		}
		public void saveMyCars(CarCategories CarCategories) {
			repo.save(CarCategories);
		}
		public Iterable<CarCategories> showAllCarCategories(){
			return repo.findAll();
		}
}

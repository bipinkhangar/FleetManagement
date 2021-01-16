package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Ammenities;
import com.example.demo.repository.AmmenitiesRepository;


@Service
public class AmmenitiesService {

	@Autowired
	AmmenitiesRepository repo;
	
	public AmmenitiesService() {}
	public AmmenitiesService(AmmenitiesRepository repo)
	{
		this.repo=repo;
	}
	public void saveAmmenities(Ammenities ammenities) {
		repo.save(ammenities);
	}
	public Iterable<Ammenities> showAllAmmenities(){
		return repo.findAll();
	}
}

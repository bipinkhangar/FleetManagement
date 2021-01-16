package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Ammenities;
import com.example.demo.service.AmmenitiesService;


@RestController
public class AmmenitiesController {
	
	@Autowired
	private AmmenitiesService service;
	@PostMapping("/ammenities")
	@Transactional
	public String selectAmmenities(@RequestBody Ammenities ammenities)
	{
		service.saveAmmenities(ammenities);
		return "your selected ammenities are" + ammenities.getAmmenitiesName();
	}
	
	@GetMapping("/all-ammenities")
	public Iterable<Ammenities> showAllAmmenities()
	{
		return service.showAllAmmenities();
	}
}

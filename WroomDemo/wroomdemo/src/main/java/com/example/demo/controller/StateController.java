package com.example.demo.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.State;

import com.example.demo.service.StateService;


@org.springframework.web.bind.annotation.RestController
public class StateController {
	@Autowired
	private StateService service;
	
	@PostMapping("/save-State")
	@Transactional
	public String registerState(@RequestBody State state)
	{
		service.saveMyState(state);
		return "Hello" + state.getStatename() + "your state is registered";
	}
	
	
}

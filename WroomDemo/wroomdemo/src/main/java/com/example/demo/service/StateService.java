package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.State;

import com.example.demo.repository.StateRepository;


@Service
public class StateService {

	@Autowired
	private StateRepository repo;

		public StateService()
		{}
		public StateService(StateRepository repo) {
			
			this.repo = repo;
		}
		public void saveMyState(State state) {
			repo.save(state);
		}
		public Iterable<State> showAllState(){
			return repo.findAll();
		}
}

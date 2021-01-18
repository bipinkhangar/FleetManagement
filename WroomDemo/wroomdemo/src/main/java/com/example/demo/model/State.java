package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states")
public class State {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "state_id")
	private int stateid;
	@Column(name = "Statename")
	private String statename;
	
	
	
	public State() {}
	
	

	public State(int stateid, String statename) {
		super();
		this.stateid = stateid;
		this.statename = statename;
		
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
}

package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Ammenities")
public class Ammenities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int AmmenitiesId;
	String AmmenitiesName;
	float AmmenitiesRate;
	
	public Ammenities() {};
	
	public Ammenities(int ammenitiesId, String ammenitiesName, float ammenitiesRate) {
		super();
		this.AmmenitiesId = ammenitiesId;
		this.AmmenitiesName = ammenitiesName;
		this.AmmenitiesRate = ammenitiesRate;
	}
	public int getAmmenitiesId() {
		return AmmenitiesId;
	}
	public void setAmmenitiesId(int ammenitiesId) {
		AmmenitiesId = ammenitiesId;
	}
	public String getAmmenitiesName() {
		return AmmenitiesName;
	}
	public void setAmmenitiesName(String ammenitiesName) {
		AmmenitiesName = ammenitiesName;
	}
	public float getAmmenitiesRate() {
		return AmmenitiesRate;
	}
	public void setAmmenitiesRate(float ammenitiesRate) {
		AmmenitiesRate = ammenitiesRate;
	}	
}

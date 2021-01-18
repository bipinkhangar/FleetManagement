package com.example.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import com.mysql.cj.jdbc.Blob;

@Entity
@Table(name = "CarCategories")
public class CarCategories {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CategoryId")
	private int categoryid;
	@Column(name = "CategoryName")
	private String categoryname;
	@Column(name = "ImgPath")
	private String imgpath;
	@Column(name = "DailyRates")
	private Double dailyrates ;
	@Column(name = "WeeklyRates")
	private Double weeklyrates;
	@Column(name = "MonthlyRates")
	private Double monthlyrates;
	
	
	public CarCategories() {}
	
	

	public CarCategories(int categoryid, String categoryname, String imgpath, Double dailyrates,
			Double weeklyrates, Double monthlyrates)
	{
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.imgpath = imgpath;
		this.dailyrates = dailyrates;
		this.weeklyrates =weeklyrates;
		this.monthlyrates = monthlyrates;
	}



	public int getCategoryid() {
		return categoryid;
	}



	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}



	public String getCategoryname() {
		return categoryname;
	}



	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}



	public String getImgpath() {
		return imgpath;
	}



	public void setImgpath(String imgpath) {
		this.imgpath = imgpath;
	}



	public Double getDailyrates() {
		return dailyrates;
	}



	public void setDailyrates(Double dailyrates) {
		this.dailyrates = dailyrates;
	}



	public Double getWeeklyrates() {
		return weeklyrates;
	}



	public void setWeeklyrates(Double weeklyrates) {
		this.weeklyrates = weeklyrates;
	}



	public Double getMonthlyrates() {
		return monthlyrates;
	}



	public void setMonthlyrates(Double monthlyrates) {
		this.monthlyrates = monthlyrates;
	}


	
}

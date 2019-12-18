package com.eatza.restaurantsearch.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name= "restaurants")
@Getter @Setter @NoArgsConstructor
public class Restaurant {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String location;
	private String cuisine;
	private int budget;
	private double rating;

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getLocation() {
		return location;
	}



	public void setLocation(String location) {
		this.location = location;
	}



	public String getCuisine() {
		return cuisine;
	}



	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}



	public int getBudget() {
		return budget;
	}



	public void setBudget(int budget) {
		this.budget = budget;
	}



	public double getRating() {
		return rating;
	}



	public void setRating(double rating) {
		this.rating = rating;
	}



	public Restaurant(String name, String location, String cuisine, int budget, double rating) {
		super();
		this.name = name;
		this.location = location;
		this.cuisine = cuisine;
		this.budget = budget;
		this.rating = rating;
	}
	
}

package com.poc.movie.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie {
	
	static String name;
	private String cover;
	private int amountOfMovies;
	private int sumOfGrades;
	private double rating;
	
	public Movie() {
	}

	public Movie(String name, String cover, int amountOfMovies, int sumOfGrades, double rating) {
		Movie.name = name;
		this.cover = cover;
		this.amountOfMovies = amountOfMovies;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}

	public void Update(String name, String cover, int amountOfMovies, int sumOfGrades, double rating) {
		Movie.name = name;
		this.cover = cover;
		this.amountOfMovies = amountOfMovies;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		Movie.name = name;
	}

	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}

	public int getAmountOfMovies() {
		return amountOfMovies;
	}
	public void setAmountOfMovies(int amountOfMovies) {
		this.amountOfMovies = amountOfMovies;
	}

	public int getSumOfGrades() {
		return sumOfGrades;
	}
	public void setSumOfGrades(int sumOfGrades) {
		this.sumOfGrades = sumOfGrades;
	}

	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}

}

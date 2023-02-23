package com.poc.movie.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
	
	static String name;
	private String cover;
	private int amountOfVotes;//nome da variavel nao eh essa
	private int sumOfGrades;
	private double rating;
	
	public Movie() {
	}

	public Movie(String name, String cover, int amountOfVotes, int sumOfGrades, double rating) {
		Movie.name = name;
		this.cover = cover;
		this.amountOfVotes= amountOfVotes;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}

	public void Update(String name, String cover, int amountOfVotes, int sumOfGrades, double rating) {
		Movie.name = name;
		this.cover = cover;
		this.amountOfVotes= amountOfVotes;
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
		return amountOfVotes;
	}
	public void setAmountOfMovies(int amountOfVotes) {
		this.amountOfVotes = amountOfVotes;
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
	public void setRating(int sumOfGrades, int amountOfVotes) {
		this.rating = sumOfGrades / amountOfVotes;
	}

}

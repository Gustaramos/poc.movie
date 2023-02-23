package com.poc.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie extends BaseEntity{
	

	@Column
	private static final long serialVersionUID = 1L;
	static String name;
	private String cover;
	
	@Column
	private int amountOfVotes;
	private int sumOfGrades;
	private double rating;
	
	public Movie() {
	}

	public Movie(String name, String cover, int amountOfVotes, int sumOfGrades, double rating) {
		Movie.name = name;
		this.cover = cover;
		this.amountOfVotes = amountOfVotes;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}

	public void Update(String name, String cover, int amountOfVotes, int sumOfGrades, double rating) {
		Movie.name = name;
		this.cover = cover;
		this.amountOfVotes = amountOfVotes;
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

	public int getAmountOfVotes() {
		return amountOfVotes;
	}
	public void setAmountOfVotes(int amountOfVotes) {
		this.amountOfVotes= amountOfVotes;
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
package com.poc.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie {
	
	@Column
	private String name;
	private String cover;
	private int amountOfVotes;
	private int sumOfGrades;
	private double rating;
	
	public Movie() {
	}

	public Movie(String name, String cover, int amountOfVotes, int sumOfGrades, double rating) {
		this.name = name;
		this.cover = cover;
		this.amountOfVotes = amountOfVotes;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}

	public void Update(String name, String cover, int amountOfVotes, int sumOfGrades, double rating) {
		this.name = name;
		this.cover = cover;
		this.setAmountOfVotes(amountOfVotes);
		this.setSumOfGrades(sumOfGrades);
		this.setRating(sumOfGrades, amountOfVotes);
	}
	
	
	public String getName() {
		return name;
	}

	public String getCover() {
		return cover;
	}

	public int getAmountOfVotes() {
		return amountOfVotes;
	}
	public void setAmountOfVotes(int amountOfVotes) {
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
		this.rating = (double) sumOfGrades / amountOfVotes;
	}

}

package com.poc.movie.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Review")
public class Review {

	@Column
	private String author;
	private String publishedOn;
	private String review;
	private int amountOfVotes;
	private int sumOfGrades;
	private double rating;
	
	public Review() {
	}
	
	public Review(String author, String publishedOn, String review, int amountOfVotes, int sumOfGrades, double rating) {
		this.author = author;
		this.publishedOn = publishedOn;
		this.review = review;
		this.amountOfVotes = amountOfVotes;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}

	public void Update(String author, String publishedOn, String review, int amountOfVotes, int sumOfGrades, double rating) {
		this.author = author;
		this.setPublishedOn(publishedOn);
		this.setReview(review);
		this.setAmountOfVotes(amountOfVotes);
		this.setSumOfGrades(sumOfGrades);
		this.setRating(sumOfGrades, amountOfVotes);
	}

	public String getAuthor() {
		return author;
	}
	
	public String getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(String publishedOn) {
		this.publishedOn = publishedOn;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
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

	public void setRating(int sumOfGrades, int amountOfVotes ) {
		this.rating = (double) sumOfGrades / amountOfVotes;
	}
}

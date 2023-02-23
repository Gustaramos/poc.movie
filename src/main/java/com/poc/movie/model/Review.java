package com.poc.movie.model;
//sem nome da tabela
public class Review {
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
		this.publishedOn = publishedOn;
		this.review = review;
		this.amountOfVotes = amountOfVotes;
		this.sumOfGrades = sumOfGrades;
		this.rating = rating;
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	
	public double getRate() {
		return rating;
	}
	public void setRate(double rating) {
		this.rating = rating;//rating = sumOfGrades/amountOfVotes
	}
	
	
}

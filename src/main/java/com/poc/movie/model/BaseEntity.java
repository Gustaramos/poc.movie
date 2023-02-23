package com.poc.movie.model;

import java.io.Serializable;

import javax.persistence.Id;

abstract class BaseEntity implements Serializable{

	private static final long serialVersionUID = 1721175577813205140L;
	
	@Id
	int id;
	
}

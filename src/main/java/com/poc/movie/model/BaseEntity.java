package com.poc.movie.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

abstract class BaseEntity implements Serializable{
	
	@Id
	int id;
	
}

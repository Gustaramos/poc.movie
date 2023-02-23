package com.poc.movie.model;

import java.io.Serializable;
import javax.persistence.Id;

abstract class BaseEntity implements Serializable{
	
	@Id
	int id;
	
	private static final long serialVersionUID = 1L;

	
}

package com.Spring.RelationshipsJPA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
  
	@Id
	private int id;
	
	@Column(nullable=false)
	private String rating;
	private String description;
	
	@ManyToOne()
	private Course course;
	
	public Review() {
		
	}
	

	public Review(int id, String rating, String description) {
		super();
		this.id = id;
		this.rating = rating;
		this.description = description;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", description=" + description + "]";
	}
	

	
	
}

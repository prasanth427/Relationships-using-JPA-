package com.Spring.RelationshipsJPA.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Course {
   
	@Id
	private int id;
	private String name;
	
	@OneToMany(mappedBy="course")
	private List<Review> Reviews=new ArrayList<>();
	
	@ManyToMany(mappedBy="Courses")
	private List<Student> Students=new ArrayList<>();
	
	public Course() {
		
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public List<Review> getReviews() {
		return Reviews;
	}

	public void addreviews(Review reviews) {
		Reviews.add(reviews);
	
	}
	
	public void removereviews(Review reviews) {
		Reviews.remove(reviews);
	
	}
	
	
	
	

	public List<Student> getStudents() {
		return Students;
	}

	public void addStudents(Student students) {
		Students.add(students);
	}
	
	public void removeStudents(Student students) {
		Students.remove(students);
		
	}
	


	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}
	
}

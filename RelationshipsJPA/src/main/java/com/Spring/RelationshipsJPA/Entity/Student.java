package com.Spring.RelationshipsJPA.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Student {
 
	@Id
	private int id;
	private String name;
	
	@OneToOne()
	private Passport passport;
	
	@ManyToMany
	@JoinTable(name="STUDENT_COURSE",joinColumns=@JoinColumn(name="STUDENT_ID"),
	inverseJoinColumns=@JoinColumn(name="COURSE_ID"))
	private List<Course> Courses=new ArrayList<>();
	
	public Student() {
		
	}

	public Student(int id, String name) {
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
	

	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	
	
	
	

	public List<Course> getCourses() {
		return Courses;
	}

	public void addCourses(Course Courses) {
		this.Courses.add(Courses);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

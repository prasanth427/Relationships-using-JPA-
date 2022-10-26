package com.Spring.RelationshipsJPA.Repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.RelationshipsJPA.Entity.Course;
import com.Spring.RelationshipsJPA.Entity.Review;
import com.Spring.RelationshipsJPA.Entity.Student;

@Repository
@Transactional
public class CourseRepository {
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
   
	@Autowired
	EntityManager em;
	
	public Course findbyid(int id) {
		return em.find(Course.class, id);
	}
		
	
		public Course save(Course course) {
			
			if(course.getId() == 0) {
				em.persist(course);
			}else {
				em.merge(course);
			}
			return course;
		}
	
	/*public Course update(Course course) {
		return em.merge(course);
	} */
		
		
		//using harcoded values 
		public  void playwithcourseandreview() {
		   Course course=findbyid(10003);
		   logger.info(" find by id -->{}", course.getReviews());
		   
		   Review reviews=new Review(50004,"3","HATS OFF");
		   
		   //Setting relation ships 
		   course.addreviews(reviews);
		  reviews.setCourse(course);
		   
		   //saving to the database 
		   em.persist(reviews);
		}
		
		
		// same as above code but with out hardCoding 
		public void  RefactoringPlaywithCOurseandreview(int course_id, List<Review> reviews) {
			Course course=findbyid(course_id);
			
		logger.info("this is for the getting reviews using id ->{}", course.getReviews());
		
		for(Review review: reviews) {
			
			course.addreviews(review);
			review.setCourse(course);
			
		course.removereviews(review);
		
			em.persist(review);
		}
			
			
		}
		
		public void Playwithcourseandstudent() {
		Course course=em.find(Course.class, 10001);
			logger.info("Find the student for the course-->{}", course.getStudents());
			 Course course1=new Course(10005,"Jenkins course ");
			Student student=new Student(20006,"Anikesh");
			em.persist(course1);
			em.persist(student);
			
			 
			course1.addStudents(student);
			student.addCourses(course1);
			
			
			em.persist(student);
			
		}
		
	}


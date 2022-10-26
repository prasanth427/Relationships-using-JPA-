package com.Spring.RelationshipsJPA.Repository;

import javax.persistence.EntityManager;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Spring.RelationshipsJPA.Entity.Passport;
import com.Spring.RelationshipsJPA.Entity.Student;

@Repository
@Transactional
public class StudentRepository {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());

	  @Autowired
	  EntityManager em;
	  
	  public Student findbyid(int id) {
		 return em.find(Student.class, id);
	  }
	  
	  public Student save(Student student) {
		  if(student.getId()==0) {
			  em.persist(student);
		  }else {
			  em.merge(student);
		  }
		  return student;
	  }
	  
	  @Transactional
	 public void Playwithstudent() {
		
		   Passport passport=new Passport(40004,"J54895");
		   em.persist(passport);
		   
		   Student student=new Student(20005,"Rahul");
		  student.setPassport(passport);
		  
		   em.merge(student);
		   
	  } 
	  
	  public void Playwithstudentandpassport() {
		  
		  Student student=em.find(Student.class, 20001);
		  logger.info(" find by id ->{}", student);
		 logger.info("Find passport -->{}", student.getPassport());
	  }
	  
	  public void playwithpassportandstudent() {
		  Passport passport=em.find(Passport.class, 40004);
		  logger.info(" find by id ->{}", passport);
			 logger.info("Find passport -->{}", passport.getStudent());
			 
	  }
} 

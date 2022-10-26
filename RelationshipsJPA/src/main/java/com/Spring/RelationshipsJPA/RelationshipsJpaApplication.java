package com.Spring.RelationshipsJPA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Spring.RelationshipsJPA.Entity.Review;
import com.Spring.RelationshipsJPA.Repository.CourseRepository;
import com.Spring.RelationshipsJPA.Repository.StudentRepository;

@SpringBootApplication
public class RelationshipsJpaApplication  implements CommandLineRunner{
   
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
CourseRepository CourseRepo;
	
	@Autowired
	StudentRepository StudentRepo;
	public static void main(String[] args) {
		SpringApplication.run(RelationshipsJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("find by id --> {} ", CourseRepo.findbyid(10001));
		logger.info("find by id --> {} ", StudentRepo.findbyid(20001));
		
		
	StudentRepo.Playwithstudent();
	StudentRepo.Playwithstudentandpassport();
	StudentRepo.playwithpassportandstudent();
	
	
	CourseRepo.playwithcourseandreview();
	List<Review> reviews=new ArrayList<>();
	reviews.add(new Review(50005,"5","I learned a lot "));
	 
	CourseRepo.RefactoringPlaywithCOurseandreview(10002, reviews );
		CourseRepo.Playwithcourseandstudent();
	}

}

insert into Course (id,name) values (10001,'Java for Beginners');
insert into Course(id,name) values (10002,'Spring for Beginners');
insert into Course(id,name) values (10003,'Maven for advanced');

insert into Passport (id,number) values (40001,'N123456');
insert into Passport (id,number) values(40002,'L124576');
insert into Passport (id,number) values (40003,'E347093');

insert into Student(id,name,passport_id) values (20001,'Prasanth',40001);
insert into Student(id,name,passport_id) values (20002,'Ranga',40002);
insert into Student(id,name,passport_id) values (20003,'Pavan',40003);


insert into Review (id,rating,description,course_id) values (50001,'5','Great Course',10001);
insert into Review (id,rating,description,course_id) values (50002,'4','Awesome Course',10002);
insert into Review (id,rating,description,course_id) values (50003,'3', 'Good Course',10003);


insert into STUDENT_COURSE (STUDENT_ID,COURSE_ID) VALUES (20001,10001)
insert into STUDENT_COURSE (STUDENT_ID,COURSE_ID) VALUES (20002,10002)
insert into STUDENT_COURSE (STUDENT_ID,COURSE_ID) VALUES (20003,10003)

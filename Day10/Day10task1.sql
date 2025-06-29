
use Day10;
create table student(
id int primary key,
name varchar(20),
marks int,
courses varchar(20),
fees int);

insert into student values(1,"Ram",88,"CS",19000);
insert into student values(2,"Ravi",85,"CT",13000);
insert into student values(3,"Rohini",66,"ECS",16000);

select * from student where marks > 80;



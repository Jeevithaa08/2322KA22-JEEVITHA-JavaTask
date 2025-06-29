use Day10;
create table courses (
id int primary key,
name varchar(20),
fees int);

insert into courses values(1,"CS",70000);
insert into courses values(2,"CT",60000);


select * from courses order by fees asc;
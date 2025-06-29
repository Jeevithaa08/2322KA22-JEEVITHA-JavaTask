use Day10;
create table emp(
id int primary key,
dept varchar(20),
salary int);
insert into emp values(1,"Block1",40000);
insert into emp values(2,"Block2",36000);
insert into emp values(3,"Block3",23000);

select * from emp where department = "Block1" order by salary desc;
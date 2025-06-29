use Day10;
create table customers(
id int primary key,
name varchar(20),
city varchar(20),
status varchar(20));

insert into customers values(1,"kaviya","coimbatore","Active");
insert into customers values(2,"Tanya","chennai","Inactive");
insert into customers values(3,"Ramya","Madurai","Active");

select * from customers where city = 'chennai' and status = 'Inactive';
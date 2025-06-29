use Day10;
create table books(
id int primary key,
title varchar(40),
author varchar(20));

insert into books values(1,"Learn Java","James gosling");
insert into books values(2,"Maserting SQL","Andrew Troelsen");
insert into books values(3,"Python tricks","Dan Bader");
select * from books where title like "%Java%";
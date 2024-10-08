--DDL Data Definition Language - Create, Alter, Truncate and Drop
--Create
create table Employee(Empid int,Empname varchar(35));

--Add new column
alter table Employee add column EmpCity varchar(25),add column Dept varchar(10);

--Modify existing column
alter table Employee alter Empcity type char(50);

--Rename column
alter table Employee rename column Empcity to City;

--DML Data Manipulation Language - INsert, Update,Delete
insert into Employee values(1112,'Meghana','Chennai','HR'),(112,'Shreya','Bnagalore','Developer');

insert into Employee(Empid,empname) values(1113,'Riya'),(1114,'Mano');
--DQL Data Retrieval Lang - Select
select * from Employee;

--DDl - Truncate - Removes all the records irrespective of condition but table structure remains as such
truncate table Employee

--DDL - Drop - Deletes the entire table 
drop table Employee


--DML - Update records
update Employee set dept='Developer' where empid in(1113,1114)

update Employee set salary = 65000 where empid in (1112,1113,1114)

update Employee set city='Chennai' where empname='Mano';
update Employee set city='Hyderabad' where empname='Riya';

--DML - delete - particular record based on condition
delete from Employee where empid=1111


alter table Employee add column Salary decimal(8,2),add column JoiningDate date

--Identity column - for Employeeid
alter table Employee drop column empid
alter table Employee add column empid int generated always as identity(start 1111 increment by 1)


insert into Employee values('Reena','Hyderabad','HR',90000.00,'2024-02-25'),
('Rishikesh','Pune','Testing',60000.00,'2024-06-25'),
('Siddharth','Bangalore','HR',90000.00,'2022-04-02'),
('Suman','Chennai','Developer',75000.00,'2023-04-12'),
('Neha','Bangalore','HR',80000.00,'2024-07-25')

--DQL - Select - Display the records, Filtering records

select * from Employee where dept='HR' and city='Bangalore'

select * from Employee where dept='HR' or city='Chennai'

select * from Employee where dept='Developer' and salary>70000;

select empid,empname,dept,salary from Employee where city='Bangalore'

select * from employee where extract(year from joiningdate)=2024 and extract(month from joiningdate)>5

--Aggregate functions - count,sum,min,max,avg
select count(*) as No_of_Employees from Employee;
select min(salary) as MinimumSalary from Employee;
select max(salary) as MaximumSalary from Employee;
select sum(salary) as TotalSalary from Employee;
select avg(salary) as AverageSalary from Employee;

--sort the records - order by clause - asc,desc

select * from Employee order by salary desc

--group by - groub the records based on dept,city
select city,count(*) from Employee group by city
select dept,count(*) from Employee group by dept

select city,dept,count(*) from Employee group by city,dept 

--having clause - filtering the result of group by
select dept,count(*) from Employee group by dept having count(*)>2 order by dept desc

select dept,min(salary) from employee group by dept



--Constraints - To achieve data integrity and to ensure the data are consistent/complete/correct
--Types - Not Null,Unique,Primary Key, Foriegn Key and check

--Not Null
alter table Employee add constraint pkempid primary key(empid)


alter table Employee drop constraint pkempid

create table Product(proid int,proname varchar(20),proprice decimal(8,2))

insert into Product values(1111,'Laptop',85000.00)

insert into Product values(1112,'Macbook',100000.00)

select * from Product

delete from Product where proname='AC'
--not null constraint
alter table Product alter column proid set not null

insert into Product values(1113,'AC',200000)

--unique constraint
alter table Product add constraint uqprname unique(proname)

--primary key - commbination of not null and unique
alter table Product add primary key(proid)

alter table Product add constraint pkproid primary key(proid)


--Check - check for particular values
alter table product add constraint chkprice check(proprice>25000.00 and proprice<=100000.00)

--foreign key - referencing another table for its values
create table category(catid int primary key,catname varchar(15) unique)

insert into category values(11,'Electronics'),(12,'HomeAppliances')

select * from category

select * from product
alter table product add column categoryid int 

alter table product add constraint fkcatid foreign key(categoryid) references category(catid)

insert into product values(1114,'Refrigerator',45000.00,12)


insert into product values(1115,'iphone',45000.00,13)

--Employee& Department
create table department(did int primary key,dname varchar(10))

insert into department values(111,'HR'),(112,'Developer'),(113,'Testing')

alter table employee drop column dept

alter table employee add column deptid int

alter table employee add foreign key(deptid) references department(did)

insert into employee(empname,deptid) values('Anupriya',114)

alter table employee alter column joiningdate set default current_timestamp

select * from employee

insert into employee(empname,city,salary) values('Gayu','Mysore',65000)

alter table employee alter column country set default 'canada'

insert into employee(empname,city,salary) values('Anilkumar','Bangalore',65000)

create table Customer(custid int primary key,custname varchar(30),country varchar(20) default 'canada')

insert into customer(custid,custname) values(1,'Megha')

select * from customer



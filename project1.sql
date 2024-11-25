create database bankSystem;
use bankSystem;

create table signup(form_no varchar(30),name varchar(30),father_name varchar(30),dob varchar(30),gender varchar(30),married_status varchar(30),address varchar(60),city varchar(30),pincode varchar(30),email varchar(50));
select * from signup;


create table Signup2(Form_no varchar(30),Religion varchar(30),Category varchar(30),Income varchar(30),Education varchar(30),Occupation varchar(30),PAN_No varchar(60),Adhar_No varchar(30),Senior_Citizen varchar(30),Existing_Acc varchar(30));
select * from signup2;


create table signup3(Form_no varchar(30),Acc_Type varchar(30),Card_No varchar(40),pin varchar(30),Facility varchar(200));
select * from signup3;


create table login(form_no varchar(30),card_no varchar(50),pin varchar(30));
select * from login;

create table bank(pin varchar(30),Date varchar(50),type varchar(30),amount varchar(30));
select * from bank;







drop database banksystem;
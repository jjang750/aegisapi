drop table residents;
CREATE TABLE residents
(
	seq SERIAL PRIMARY KEY,
	aptcode VARCHAR(5) not null,
	orgapt VARCHAR(5) not null,
	house_no VARCHAR(10) not null,

	head_of_household VARCHAR(1),
	same_address VARCHAR(1),
	have_car VARCHAR(1),
	house_owner VARCHAR(1),

	apt_name VARCHAR(50),
	apt_dong VARCHAR(4),
	apt_ho VARCHAR(4),
	moving_in_date VARCHAR(8),
	residence_from VARCHAR(8),
	residence_to VARCHAR(8),
	owner_name VARCHAR(20),
	owner_address VARCHAR(200),
	owner_phone VARCHAR(12),
	api VARCHAR(128),
	version VARCHAR(10),
	description VARCHAR(2000),
	create_dt date NOT NULL default current_date

);

select * from residents ;


drop table  composition;
CREATE TABLE composition
(

seq SERIAL PRIMARY KEY,
index INTEGER not null,
aptcode VARCHAR(5) not null,
orgapt VARCHAR(5) not null,
house_no VARCHAR(10) not null,
household_type VARCHAR(2) ,
household_owner VARCHAR(1) ,
household_name VARCHAR(20) ,
household_birthday VARCHAR(8) ,
household_phone VARCHAR(13)

);



drop table cars;
CREATE TABLE cars
(

seq SERIAL PRIMARY KEY, 
index INTEGER not null,
aptcode VARCHAR(5) not null,
orgapt VARCHAR(5) not null,
house_no VARCHAR(10) not null,
owner_name VARCHAR(20) ,
car_type VARCHAR(20) ,
car_no VARCHAR(10) ,
electric_car VARCHAR(1)

);


aptcode, 
orgapt, 
house_no, 
head_of_household, 
same_address, 
have_car, 
house_owner,
apt_name, 
apt_dong, 
apt_ho,
moving_in_date,
residence_from,
residence_to,
owner_name,
owner_address,
owner_phone,
api,
version,
description

insert into residents (

	index,
	household_type,
	household_owner,
	household_name,
	household_birthday,
	household_phone

) values ()


index,
owner_name,
car_type,
car_no,
electric_car

'${aptcode}',
'${orgapt}',
'${house_no}',
'${head_of_household}',
'${same_address}',
'${have_car}',
'${house_owner}',
'${apt_name}',
'${apt_dong}',
'${apt_ho}',
'${moving_in_date}',
'${residence_from}',
'${residence_to}',
'${owner_name}',
'${owner_address}',
'${owner_phone}',
'${api}',
'${version}',
'${description}'

'${index}',
'${household_type}',
'${household_owner}',
'${household_name}',
'${household_birthday}',
'${household_phone}'


'${index}',
'${owner_name}',
'${car_type}',
'${car_no}',
'${electric_car}'


docker build -t aegisapi:0.0.1 .
docker run -d -e "PS_HOST=panthipnas.ddns.net" -e "PS_USER=openapi" -e "PS_PASSWORD=dlwltmdpsxj1!" -p 80:80 aegisapi:0.0.1



"aptcode",
"orgapt",
"house_no",
"head_of_household",
"same_address",
"have_car",
"house_owner",
"apt_name",
"apt_dong",
"apt_ho",
"moving_in_date",
"residence_from",
"residence_to",
"owner_name",
"owner_address",
"owner_phone",
"api",
"version",
"description"


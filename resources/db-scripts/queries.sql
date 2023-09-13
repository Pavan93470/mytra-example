create table item (
id int PRIMARY KEY,
name varchar(50),
description varchar(250) UNIQUE,
category varchar(50),
brand varchar(20),
color varchar(15),
quantity int,
available_qty int
);



create table item_price (
id int PRIMARY KEY,
price NUMERIC(10,2),
discount NUMERIC(10,2),
item_id int,
CONSTRAINT fk_item_id
FOREIGN KEY(item_id)
REFERENCES item(id)
);

ALTER TABLE item ADD
CONSTRAINT fk_price 
FOREIGN KEY(item_price_id)
REFERENCES item_price(id);



create table person_details(
	id int PRIMARY KEY,
	 name varchar ,
	 email varchar ,
	ph_number varchar 
);

ALTER TABLE person_details 
RENAME COLUMN person_id TO id;




create table ordertracking (
id int PRIMARY KEY,
orderid int,
itemid int,
addressid int,
deliverydate varchar(50),
ordereddate varchar(50),
status varchar(50),
userid int 
);
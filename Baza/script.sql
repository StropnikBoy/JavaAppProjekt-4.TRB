/*
Created		9. 05. 2018
Modified		9. 05. 2018
Project		
Model			
Company		
Author		
Version		
Database		PostgreSQL 8.1 
*/


/* Create Domains */


/* Create Tables */


Create table "users"
(
	"id" Serial NOT NULL,
	"residence_id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"surname" Varchar(50) NOT NULL,
	"email" Varchar(100) NOT NULL,
	"tel" Varchar(20) NOT NULL,
	"birthday" Date NOT NULL,
	"password" Varchar(40) NOT NULL,
	"rank" Integer NOT NULL,
 primary key ("id")
) Without Oids;


Create table "residences"
(
	"id" Serial NOT NULL,
	"post_number" Integer NOT NULL,
	"name" Varchar(40) NOT NULL,
 primary key ("id")
) Without Oids;


Create table "avatars"
(
	"id" Serial NOT NULL,
	"user_id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"url" Varchar(150) NOT NULL,
 primary key ("id")
) Without Oids;


Create table "orders"
(
	"id" Serial NOT NULL,
	"user_id" Integer NOT NULL,
	"date" Date NOT NULL,
 primary key ("id")
) Without Oids;


Create table "ads_orders"
(
	"id" Serial NOT NULL,
	"ad_id" Integer NOT NULL,
	"order_id" Integer NOT NULL,
	"quantity" Double precision NOT NULL,
 primary key ("id")
) Without Oids;


Create table "ads"
(
	"id" Serial NOT NULL,
	"category_id" Integer NOT NULL,
	"title" Varchar(100) NOT NULL,
	"cost" Double precision NOT NULL,
 primary key ("id")
) Without Oids;


Create table "categories"
(
	"id" Serial NOT NULL,
	"category_id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"description" Text,
 primary key ("id")
) Without Oids;


Create table "pictures"
(
	"id" Serial NOT NULL,
	"ad_id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"url" Varchar(150) NOT NULL,
 primary key ("id")
) Without Oids;


/* Create Tab 'Others' for Selected Tables */


/* Create Indexes */



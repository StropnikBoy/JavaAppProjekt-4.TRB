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
	"id" Bigint NOT NULL,
	"user_id" Integer NOT NULL,
	"name" Varchar(50) NOT NULL,
	"url" Varchar(150) NOT NULL,
 primary key ("id")
) Without Oids;


Create table "orders"
(
	"id" Bigint NOT NULL,
	"user_id" Integer NOT NULL,
	"date" Date NOT NULL,
 primary key ("id")
) Without Oids;


Create table "ads_orders"
(
	"id" Bigint NOT NULL,
	"ad_id" Bigint NOT NULL,
	"order_id" Bigint NOT NULL,
	"quantity" Real NOT NULL,
 primary key ("id")
) Without Oids;


Create table "ads"
(
	"id" Bigint NOT NULL,
	"category_id" Bigint NOT NULL,
	"title" Varchar(100) NOT NULL,
	"cost" Real NOT NULL,
 primary key ("id")
) Without Oids;


Create table "categories"
(
	"id" Bigint NOT NULL,
	"category_id" Bigint NOT NULL,
	"name" Varchar(50) NOT NULL,
	"description" Text,
 primary key ("id")
) Without Oids;


Create table "pictures"
(
	"id" Bigint NOT NULL,
	"ad_id" Bigint NOT NULL,
	"name" Varchar(50) NOT NULL,
	"url" Varchar(150) NOT NULL,
 primary key ("id")
) Without Oids;


/* Create Tab 'Others' for Selected Tables */


/* Create Indexes */



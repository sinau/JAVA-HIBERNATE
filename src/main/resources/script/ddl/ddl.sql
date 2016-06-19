CREATE DATABASE sinau_hibernate;

use sinau_hibernate;

create table EMPLOYEE (
   id BIGINT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   salary     DECIMAL  default NULL,
   PRIMARY KEY (id)
);

create table ADDRESS (
   id BIGINT NOT NULL,
   street_name VARCHAR(40) default NULL,
   city_name VARCHAR(40) default NULL,
   state_name VARCHAR(40) default NULL,
   zipcode VARCHAR(10) default NULL,
   CONSTRAINT FK_EMPLOYEE FOREIGN KEY (id) REFERENCES employee(id)
);

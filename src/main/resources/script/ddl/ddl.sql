CREATE DATABASE sinau_hibernate;

use sinau_hibernate;

create table EMPLOYEE (
   id BIGINT NOT NULL auto_increment,
   first_name VARCHAR(20) default NULL,
   salary     DECIMAL  default NULL,
   PRIMARY KEY (id)
);